package com.wapgyj.orderservice.model;

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
 * @since 2025-02-04
 */
@TableName("tb_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private String userCurrency;

    private String address;

    private String email;

    private LocalDateTime createdAt;

    private String paymentStatus;

    private Boolean isDeleted;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserCurrency() {
        return userCurrency;
    }

    public void setUserCurrency(String userCurrency) {
        this.userCurrency = userCurrency;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "Order{" +
            "id=" + id +
            ", userId=" + userId +
            ", userCurrency=" + userCurrency +
            ", address=" + address +
            ", email=" + email +
            ", createdAt=" + createdAt +
            ", paymentStatus=" + paymentStatus +
            ", isDeleted=" + isDeleted +
        "}";
    }

    public Order(Integer userId, String userCurrency, String address, String email, String paymentStatus) {
        this.userId = userId;
        this.userCurrency = userCurrency;
        this.address = address;
        this.email = email;
        this.paymentStatus = paymentStatus;
    }

    public Order() {
    }
}
