package com.wapgyj.paymentservice.service;

import com.wapgyj.paymentservice.model.Payment;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wapGYJ
 * @since 2025-02-10
 */
public interface IPaymentService extends IService<Payment> {

    String AliPay(Integer userId, Integer orderId, BigDecimal amount);

    boolean handleAliPayNotify(Map<String, String> params);

    Payment transaction(Integer orderId);
}
