package com.wapgyj.orderservice.service;

import com.wapgyj.orderservice.model.Address;
import com.wapgyj.orderservice.model.Order;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wapgyj.orderservice.model.OrderItems;
import com.wapgyj.orderservice.model.OrderVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wapGYJ
 * @since 2025-02-04
 */
public interface IOrderService extends IService<Order> {

    String placeOrder(Integer userId, String userCurrency, Address address, String email, List<OrderItems> orderItems);

    OrderVO convertToOrderVO(Order order);

    List<OrderVO> getOrder(Integer userId);

    void markPaid(Integer userId, Integer orderId);
}
