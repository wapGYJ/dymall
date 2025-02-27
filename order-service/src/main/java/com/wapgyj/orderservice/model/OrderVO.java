package com.wapgyj.orderservice.model;

import java.time.LocalDateTime;
import java.util.List;

public class OrderVO {
    private String orderId;
    private Integer userId;
    private String userCurrency;
    private Address address;  // 地址改为 Address 类型
    private String email;
    private LocalDateTime createdAt;  // 可以使用时间戳（int类型）
    private String paymentStatus;
    private List<OrderItems> orderItems;  // 包含多个订单项


    public OrderVO(String orderId, Integer userId, String userCurrency, Address address, String email, LocalDateTime createdAt, List<OrderItems> orderItems) {
        this.orderId = orderId;
        this.userId = userId;
        this.userCurrency = userCurrency;
        this.address = address;
        this.email = email;
        this.createdAt = createdAt;
        this.orderItems = orderItems;
    }

    public OrderVO(String orderId, Integer userId, Address address, String userCurrency, String email, LocalDateTime createdAt, String paymentStatus, List<OrderItems> orderItems) {
        this.orderId = orderId;
        this.userId = userId;
        this.address = address;
        this.userCurrency = userCurrency;
        this.email = email;
        this.createdAt = createdAt;
        this.paymentStatus = paymentStatus;
        this.orderItems = orderItems;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserCurrency() {
        return userCurrency;
    }

    public void setUserCurrency(String userCurrency) {
        this.userCurrency = userCurrency;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
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

    public List<OrderItems> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItems> orderItems) {
        this.orderItems = orderItems;
    }

    public OrderVO() {
    }
}
