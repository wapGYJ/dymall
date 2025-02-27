package com.wapgyj.orderservice.model;

import java.util.List;

public class PlaceOrderReq {
    Integer userId;
    String  userCurrency;
    Address address;
    String  email;
    List<OrderItems> orderItems;

    public PlaceOrderReq() {
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

    public List<OrderItems> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItems> orderItems) {
        this.orderItems = orderItems;
    }

    public PlaceOrderReq(Integer userId, String userCurrency, Address address,  String email, List<OrderItems> orderItems) {
        this.userId = userId;
        this.userCurrency = userCurrency;
        this.address = address;
        this.email = email;
        this.orderItems = orderItems;
    }
}
