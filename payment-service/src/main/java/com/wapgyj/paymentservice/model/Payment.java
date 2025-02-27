package com.wapgyj.paymentservice.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wapGYJ
 * @since 2025-02-10
 */
@TableName("tb_payment")
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "transaction_id", type = IdType.AUTO)
    private Integer transactionId;

    private Integer orderId;

    private Integer userId;

    private LocalDateTime paymentTime;

    private String paymentStatus;

    private BigDecimal amount;

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }
    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Payment(Integer orderId, Integer userId, BigDecimal amount) {
        this.orderId = orderId;
        this.userId = userId;
        this.amount = amount;
    }

    public Payment() {
    }

    public Payment(Integer transactionId, Integer orderId, Integer userId, LocalDateTime paymentTime, BigDecimal amount, String paymentStatus) {
        this.transactionId = transactionId;
        this.orderId = orderId;
        this.userId = userId;
        this.paymentTime = paymentTime;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Payment{" +
            "transactionId=" + transactionId +
            ", orderId=" + orderId +
            ", userId=" + userId +
            ", paymentTime=" + paymentTime +
            ", paymentStatus=" + paymentStatus +
            ", amount=" + amount +
        "}";
    }
}
