

package com.wapgyj.paymentservice.service.impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradePagePayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wapgyj.paymentservice.config.AliPayConfig;
import com.wapgyj.paymentservice.model.Payment;
import com.wapgyj.paymentservice.mapper.PaymentMapper;
import com.wapgyj.paymentservice.service.IPaymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wapGYJ
 * @since 2025-02-10
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements IPaymentService {

    @Autowired
    private AliPayConfig aliPayConfig;

    @Override
    @Transactional
    public String AliPay(Integer userId, Integer orderId, BigDecimal amount) {
        // 1. 检查订单是否已存在
        Payment existPayment = this.getOne(new QueryWrapper<Payment>()
                .eq("order_id", orderId));

        if (existPayment != null) {
            if ("PAID".equals(existPayment.getPaymentStatus())) {
                return "ALIPAY_ORDER_EXISTS"; // 已支付订单
            }
            // 已存在未支付订单，直接返回支付信息
            return generatePayForm(existPayment);
        }

        // 2. 创建新支付记录
        Payment payment = new Payment();
        payment.setOrderId(orderId);
        payment.setUserId(userId);
        payment.setAmount(amount);
        payment.setPaymentStatus("UNPAID");

        this.save(payment);

        // 3. 生成支付宝支付表单
        return generatePayForm(payment);
    }

    private String generatePayForm(Payment payment) {
        try {
            // 初始化支付宝客户端
            AlipayClient alipayClient = new DefaultAlipayClient(
                    aliPayConfig.getGateway(),
                    aliPayConfig.getAppId(),
                    aliPayConfig.getAppPrivateKey(),
                    "json",
                    "UTF-8",
                    aliPayConfig.getAlipayPublicKey(),
                    aliPayConfig.getSignType());

            // 创建支付模型
            AlipayTradePagePayModel model = new AlipayTradePagePayModel();
            model.setOutTradeNo(String.valueOf(payment.getOrderId()));
            model.setTotalAmount(payment.getAmount().setScale(2, RoundingMode.HALF_UP).toString());
            model.setSubject("订单支付");
            model.setProductCode("FAST_INSTANT_TRADE_PAY");
            model.setTimeoutExpress("5m");

            // 创建支付请求
            AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
            request.setReturnUrl("https://www.bilibili.com/"); // 设置同步回调地址
            request.setNotifyUrl(aliPayConfig.getNotifyUrl()); // 异步通知地址
            request.setBizModel(model);

            // 调用SDK生成表单
            return alipayClient.pageExecute(request).getBody();
        } catch (AlipayApiException e) {
            throw new RuntimeException("支付宝支付创建失败", e);
        }
    }

    // 支付结果通知处理
    @Transactional
    public boolean handleAliPayNotify(Map<String, String> params) {
        try {
            // 验证签名
            boolean signVerified = AlipaySignature.rsaCheckV1(
                    params,
                    aliPayConfig.getAlipayPublicKey(),
                    "UTF-8",
                    aliPayConfig.getSignType());

            if (!signVerified) {
                return false;
            }

            // 处理交易状态
            String tradeStatus = params.get("trade_status");
            String orderId = params.get("out_trade_no");

            if ("TRADE_SUCCESS".equals(tradeStatus)) {
                // 更新支付状态
                Payment payment = this.getOne(new QueryWrapper<Payment>()
                        .eq("order_id", orderId));
                //
                if (payment != null && !"PAID".equals(payment.getPaymentStatus())) {
                    payment.setPaymentStatus("PAID");
                    payment.setPaymentTime(LocalDateTime.now());
                    this.updateById(payment);
                }
                return true;
            }
            return false;
        } catch (AlipayApiException e) {
            throw new RuntimeException("支付宝通知验证失败", e);
        }
    }

    @Override
    public Payment transaction(Integer orderId) {

        return this.getOne(new QueryWrapper<Payment>().eq("order_id", orderId));
    }
}
