package com.wapgyj.cartservice.controller;


import com.wapgyj.cartservice.model.CartItems;
import com.wapgyj.cartservice.service.ICartItemsService;
import com.wapgyj.cartservice.service.ICartService;
import com.wapgyj.common.Result.Result;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wapGYJ
 * @since 2025-02-03
 */
@RestController
@RequestMapping("/carts")
public class CartController {

   private final ICartService cartService;

    public CartController(ICartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/additem")
    public Result<Boolean> addItem(@RequestParam("userId") Integer userId, @RequestParam("productId") Integer productId,
                          @RequestParam("quantity") Integer quantity) {
        return Result.success(cartService.addItem(userId, productId, quantity));
    }

   @PostMapping("/empty")
    public Result<Boolean> emptyCart(@RequestParam("userId") Integer userId) {
        return Result.success(cartService.emptyCart(userId));
    }
    @PostMapping("/list")
    public Result<List<CartItems>> getCartItems(@RequestParam("userId") Integer userId) {
        return Result.success(cartService.getCartItems(userId));
    }

}
