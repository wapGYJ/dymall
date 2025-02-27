package com.wapgyj.orderservice.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wapGYJ
 * @since 2025-02-04
 */
@TableName("tb_order_items")
public class OrderItems implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_item_id", type = IdType.AUTO)
    private Integer orderItemId;

    private Integer orderId;

    private Integer productId;

    private Integer quantity;

    private BigDecimal cost;

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "OrderItems{" +
            "orderItemId=" + orderItemId +
            ", orderId=" + orderId +
            ", productId=" + productId +
            ", quantity=" + quantity +
            ", cost=" + cost +
        "}";
    }

    public OrderItems(Integer orderId, Integer productId, Integer quantity, BigDecimal cost) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.cost = cost;
    }

    public OrderItems(Integer productId, Integer quantity, BigDecimal cost) {
        this.productId = productId;
        this.quantity = quantity;
        this.cost = cost;
    }

    public OrderItems() {
    }
}
