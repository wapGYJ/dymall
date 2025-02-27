package com.wapgyj.paymentservice.controller;


import com.wapgyj.paymentservice.model.Payment;
import com.wapgyj.paymentservice.service.IPaymentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wapGYJ
 * @since 2025-02-10
 */
@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final IPaymentService  paymentService;

    public PaymentController(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/alipay")
   public String pay(@RequestParam("userId") Integer userId,
                      @RequestParam("orderId")Integer orderId,@RequestParam("amount")BigDecimal amount) {
       return paymentService.AliPay(userId,orderId,amount);
   }

    @PostMapping("/notify")
    public String paymentNotify(HttpServletRequest request) {
        Map<String, String> params = convertRequestParams(request);
        boolean handleResult = paymentService.handleAliPayNotify(params);
        return handleResult ? "success" : "failure";
    }

    private Map<String, String> convertRequestParams(HttpServletRequest request) {
        return request.getParameterMap().entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> String.join(",", entry.getValue())
                ));
    }

    @PostMapping("/transaction")
    public Payment transaction(@RequestParam("orderId")Integer orderId) {
        return paymentService.transaction(orderId);
    }
}
