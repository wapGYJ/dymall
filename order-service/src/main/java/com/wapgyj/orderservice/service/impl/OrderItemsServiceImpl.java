package com.wapgyj.orderservice.service.impl;

import com.wapgyj.orderservice.model.OrderItems;
import com.wapgyj.orderservice.mapper.OrderItemsMapper;
import com.wapgyj.orderservice.service.IOrderItemsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wapGYJ
 * @since 2025-02-04
 */
@Service
public class OrderItemsServiceImpl extends ServiceImpl<OrderItemsMapper, OrderItems> implements IOrderItemsService {

}
