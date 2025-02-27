package com.wapgyj.cartservice.service;

import com.wapgyj.cartservice.model.CartItems;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wapGYJ
 * @since 2025-02-03
 */
public interface ICartItemsService extends IService<CartItems> {

    boolean haveItem(Integer userId, Integer productId);

    boolean updateQuantity(Integer userId, Integer productId, Integer quantity);
}
