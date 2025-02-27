package com.wapgyj.orderservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wapgyj.orderservice.model.Address;
import com.wapgyj.orderservice.model.Order;
import com.wapgyj.orderservice.mapper.OrderMapper;
import com.wapgyj.orderservice.model.OrderItems;
import com.wapgyj.orderservice.model.OrderVO;
import com.wapgyj.orderservice.service.IOrderItemsService;
import com.wapgyj.orderservice.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wapgyj.orderservice.util.ParseAddressString;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author wapGYJ
 * @since 2025-02-04
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

    private final IOrderItemsService orderItemsService;

    public OrderServiceImpl(IOrderItemsService orderItemsService) {
        this.orderItemsService = orderItemsService;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String placeOrder(Integer userId, String userCurrency, Address address, String email, List<OrderItems> orderItems) {

        try {
            // 创建订单对象
            Order order = new Order(userId, userCurrency, address.toString(), email, "UNPAID");
            // 保存订单
            this.save(order);

            // 获取生成的订单 ID
            Integer orderId = order.getId();

            // 设置订单项的 orderId 并保存
            for (OrderItems orderItem : orderItems) {
                orderItem.setOrderId(orderId);  // 确保订单项关联到正确的订单

                orderItemsService.save(orderItem);
            }

            return orderId.toString();

        } catch (Exception e) {
            throw new RuntimeException("下单失败", e);
        }
    }

    @Override
    public OrderVO convertToOrderVO(Order order) {

        // 将地址字符串解析为 Address 对象
        String stringAddress = order.getAddress();
        ParseAddressString parseAddressString = new ParseAddressString();
        Address address = parseAddressString.parseAddressString(stringAddress);


        //获取orderItems

        QueryWrapper<OrderItems> wrapper = new QueryWrapper<OrderItems>().eq("order_id", order.getId());
        List<OrderItems> itemsList = orderItemsService.list(wrapper);

        // 创建并返回 OrderVO


        return new OrderVO(order.getId().toString(), order.getUserId(), order.getUserCurrency(), address,
                order.getEmail(), order.getCreatedAt(), itemsList);
    }


    @Override
    public List<OrderVO> getOrder(Integer userId) {
        // 直接获取该用户的全部订单
        List<Order> orderList = this.list(new QueryWrapper<Order>().eq("user_id", userId));

        if (orderList==null) {
            return null;
        }

        ArrayList<OrderVO> orderVOS = new ArrayList<>();
        for (Order order : orderList) {
                    orderVOS.add(this.convertToOrderVO(order));
        }
       return orderVOS;
    }


    @Override
    public void markPaid(Integer userId, Integer orderId) {
         Order order = this.getOne(new QueryWrapper<Order>().eq("user_id", userId).eq("id", orderId));
         order.setPaymentStatus("PAID");
         this.updateById(order);
    }
}
