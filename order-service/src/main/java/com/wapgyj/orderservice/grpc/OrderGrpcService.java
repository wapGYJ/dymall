package com.wapgyj.orderservice.grpc;

import com.wapgyj.common.proto.CartProto;
import com.wapgyj.common.proto.OrderProto;
import com.wapgyj.common.proto.OrderServiceGrpc;
import com.wapgyj.orderservice.model.Address;
import com.wapgyj.orderservice.model.OrderItems;
import com.wapgyj.orderservice.model.OrderVO;
import com.wapgyj.orderservice.service.IOrderService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@GrpcService
public class OrderGrpcService extends OrderServiceGrpc.OrderServiceImplBase {

    private final IOrderService orderService;

    public OrderGrpcService(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void placeOrder(OrderProto.PlaceOrderReq request, StreamObserver<OrderProto.PlaceOrderResp> responseObserver) {
        int userId = request.getUserId();
        String userCurrency = request.getUserCurrency();
        String email = request.getEmail();
        // 地址转换
        OrderProto.Address address = request.getAddress();
        Address addressModel = new Address(address.getStreetAddress(), address.getCity(),
                address.getCountry(), address.getState(), address.getZipCode());
        // 商品转换
        List<OrderItems> orderItemsList =new ArrayList<>();

        for (OrderProto.OrderItem orderItem : request.getOrderItemsList()) {
            orderItemsList.add(new OrderItems(orderItem.getItem().getProductId(),
                    orderItem.getItem().getQuantity(),new BigDecimal(Float.toString(orderItem.getCost()))));
        }
        //调用
        String s = orderService.placeOrder(userId, userCurrency, addressModel, email, orderItemsList);
        //返回
        OrderProto.PlaceOrderResp resp = OrderProto.PlaceOrderResp.newBuilder().
                setOrder(OrderProto.OrderResult.newBuilder().setOrderId(s).build()).build();

        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

    @Override
    public void listOrder(OrderProto.ListOrderReq request, StreamObserver<OrderProto.ListOrderResp> responseObserver) {
        int userId = request.getUserId();
        OrderProto.ListOrderResp.Builder responseBuilder = OrderProto.ListOrderResp.newBuilder();
        for (OrderVO orderVO : orderService.getOrder(userId)) {
            //构建除了items的builder
            String date = String.format("%d%02d%02d",
                    orderVO.getCreatedAt().getYear(),
                    orderVO.getCreatedAt().getMonthValue(),
                    orderVO.getCreatedAt().getDayOfMonth());
            int newData = Integer.parseInt(date);


            OrderProto.Order.Builder order = OrderProto.Order.newBuilder().
                    setOrderId(orderVO.getOrderId()).
                    setUserId(orderVO.getUserId()).
                    setUserCurrency(orderVO.getUserCurrency()).
                    setEmail(orderVO.getEmail()).
                    setCreatedAt(newData).
                    setAddress(OrderProto.Address.newBuilder().
                            setStreetAddress(orderVO.getAddress().getStreetAddress()).
                           setCity(orderVO.getAddress().getCity())
                            .setCountry(orderVO.getAddress().getCountry())
                            .setState(orderVO.getAddress().getState())
                            .setZipCode(orderVO.getAddress().getZipCode())
                            .build()
                    );


            for (OrderItems orderItem : orderVO.getOrderItems()) {
                CartProto.CartItem cartItem = CartProto.CartItem.newBuilder().setQuantity(orderItem.getQuantity()).
                        setProductId(orderItem.getProductId()).build();

                OrderProto.OrderItem realOrderItem = OrderProto.OrderItem.newBuilder().setItem(cartItem).
                        setCost(orderItem.getCost().floatValue()).build();

                order.addOrderItems(realOrderItem);
            }
         responseBuilder.addOrders(order.build());
        }

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void markOrderPaid(OrderProto.MarkOrderPaidReq request, StreamObserver<OrderProto.MarkOrderPaidResp> responseObserver) {
        String orderId = request.getOrderId();
        int userId = request.getUserId();
        orderService.markPaid(userId, Integer.parseInt(orderId));

        OrderProto.MarkOrderPaidResp resp = OrderProto.MarkOrderPaidResp.newBuilder().build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }
}
