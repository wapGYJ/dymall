package com.wapgyj.cartservice.service;

import com.wapgyj.cartservice.model.Cart;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wapgyj.cartservice.model.CartItems;


import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wapGYJ
 * @since 2025-02-03
 */

public interface ICartService extends IService<Cart> {
     boolean haveCart(Integer userId);
     boolean addItem(Integer userId, Integer productId, Integer quantity);

    boolean emptyCart(Integer userId);

    List<CartItems> getCartItems(Integer userId);
}
