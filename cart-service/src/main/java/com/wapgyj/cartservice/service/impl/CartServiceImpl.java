package com.wapgyj.cartservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wapgyj.cartservice.model.Cart;
import com.wapgyj.cartservice.mapper.CartMapper;
import com.wapgyj.cartservice.model.CartItems;
import com.wapgyj.cartservice.service.ICartItemsService;
import com.wapgyj.cartservice.service.ICartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wapGYJ
 * @since 2025-02-03
 */
@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements ICartService {


    public ICartItemsService cartItemsService;

    public CartServiceImpl(ICartItemsService cartItemsService) {
        this.cartItemsService = cartItemsService;
    }

    @Override
    public boolean haveCart(Integer userId) {
        return this.getById(userId) != null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean addItem(Integer userId, Integer productId, Integer quantity) {
        if (!haveCart(userId)) {
            this.save(new Cart(userId, userId));

        }
        if (cartItemsService.haveItem(userId, productId)) {
            return cartItemsService.updateQuantity(userId, productId, quantity);
        }
        return cartItemsService.save(new CartItems(userId,productId,quantity));

    }
    @Override
    public boolean emptyCart(Integer userId) {

        return cartItemsService.removeById(userId);
    }

    @Override
    public List<CartItems> getCartItems(Integer userId) {


        QueryWrapper<CartItems> cartItemsQueryWrapper = new QueryWrapper<CartItems>().eq("cart_id", userId);

        return cartItemsService.list(cartItemsQueryWrapper);
    }
}
