package com.wapgyj.cartservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.wapgyj.cartservice.model.CartItems;
import com.wapgyj.cartservice.mapper.CartItemsMapper;
import com.wapgyj.cartservice.service.ICartItemsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wapGYJ
 * @since 2025-02-03
 */
@Service
public class CartItemsServiceImpl extends ServiceImpl<CartItemsMapper, CartItems> implements ICartItemsService {
    @Override
    public boolean haveItem(Integer userId, Integer productId) {
        QueryWrapper<CartItems> eq = new QueryWrapper<CartItems>().eq("cart_id", userId).eq("product_id", productId);
        return this.getOne(eq) != null;
    }

    @Override
    public boolean updateQuantity(Integer userId, Integer productId, Integer quantity) {

        UpdateWrapper<CartItems> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("cart_id", userId)
                .eq("product_id", productId);
        // 将 quantity 在原来的基础上加上传入的 quantity 值
        updateWrapper.setSql("quantity = quantity + " + quantity);
        return this.update(null, updateWrapper);
    }
}
