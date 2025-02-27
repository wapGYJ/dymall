package com.wapgyj.orderservice.controller;


import com.wapgyj.common.Result.Result;
import com.wapgyj.orderservice.model.OrderVO;
import com.wapgyj.orderservice.model.PlaceOrderReq;
import com.wapgyj.orderservice.service.IOrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wapGYJ
 * @since 2025-02-04
 */
@RestController
@RequestMapping("/orders")
public class OrderController {
  private final IOrderService orderService;

    public OrderController(IOrderService orderService) {
        this.orderService = orderService;
    }
    @PostMapping("/place")
    public Result<String> placeOrder(@RequestBody PlaceOrderReq placeOrderReq){
        return Result.success(orderService.placeOrder(placeOrderReq.getUserId(), placeOrderReq.getUserCurrency(),
                placeOrderReq.getAddress(), placeOrderReq.getEmail(), placeOrderReq.getOrderItems()));
    }

    @PostMapping("/{userId}")
    public Result<List<OrderVO>> getOrder(@PathVariable Integer userId){
        return Result.success(orderService.getOrder(userId));
    }

    @PostMapping("/markPaid")
    public void markPaid(@RequestParam("userId")Integer userId,@RequestParam("orderId") Integer orderId){
        orderService.markPaid(userId, orderId);

    }

}
