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
@TableName("tb_cart")
public class Cart implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cart_id", type = IdType.AUTO)
    private Integer cartId;

    private Integer userId;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Cart{" +
            "cartId=" + cartId +
            ", userId=" + userId +
        "}";
    }

    public Cart() {
    }

    public Cart(Integer userId) {
        this.userId = userId;
    }

    public Cart(Integer userId, Integer cartId) {
        this.userId = userId;
        this.cartId = cartId;
    }
}
