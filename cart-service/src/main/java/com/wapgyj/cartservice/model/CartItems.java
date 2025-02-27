package com.wapgyj.cartservice.model;

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
 * @since 2025-02-03
 */
@TableName("tb_cart_items")
public class CartItems implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cart_id", type = IdType.NONE)
    private Integer cartId;

    private Integer productId;

    private Integer quantity;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
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

    public CartItems(Integer cartId, Integer productId, Integer quantity) {
        this.cartId = cartId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public CartItems() {
    }

    @Override
    public String toString() {
        return "CartItems{" +
            "cartId=" + cartId +
            ", productId=" + productId +
            ", quantity=" + quantity +
        "}";
    }
}
