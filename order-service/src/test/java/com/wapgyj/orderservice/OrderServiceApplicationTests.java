package com.wapgyj.orderservice;

import com.wapgyj.orderservice.model.Address;
import com.wapgyj.orderservice.model.OrderItems;
import com.wapgyj.orderservice.service.IOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class OrderServiceApplicationTests {
@Autowired
    private IOrderService orderService;
    @Test
    void contextLoads() {
    }


    @Test
    void testPlaceOrder(){
        orderService.placeOrder(1, "USD", new Address("Street 1", "City 1", "Country 1", "State 1", 12345), "email@example.com",
                new java.util.ArrayList<OrderItems>() {
                    {
                        add(new OrderItems(1, 1, 1, new BigDecimal("10.00")));
                        add(new OrderItems(1, 2, 2, new BigDecimal("20.00")));
                    }
                }
        );
    }

}
