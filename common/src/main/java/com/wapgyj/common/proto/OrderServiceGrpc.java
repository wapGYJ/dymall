package com.wapgyj.common.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: order.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OrderServiceGrpc {

  private OrderServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "order.OrderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wapgyj.common.proto.OrderProto.PlaceOrderReq,
      com.wapgyj.common.proto.OrderProto.PlaceOrderResp> getPlaceOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlaceOrder",
      requestType = com.wapgyj.common.proto.OrderProto.PlaceOrderReq.class,
      responseType = com.wapgyj.common.proto.OrderProto.PlaceOrderResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wapgyj.common.proto.OrderProto.PlaceOrderReq,
      com.wapgyj.common.proto.OrderProto.PlaceOrderResp> getPlaceOrderMethod() {
    io.grpc.MethodDescriptor<com.wapgyj.common.proto.OrderProto.PlaceOrderReq, com.wapgyj.common.proto.OrderProto.PlaceOrderResp> getPlaceOrderMethod;
    if ((getPlaceOrderMethod = OrderServiceGrpc.getPlaceOrderMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getPlaceOrderMethod = OrderServiceGrpc.getPlaceOrderMethod) == null) {
          OrderServiceGrpc.getPlaceOrderMethod = getPlaceOrderMethod =
              io.grpc.MethodDescriptor.<com.wapgyj.common.proto.OrderProto.PlaceOrderReq, com.wapgyj.common.proto.OrderProto.PlaceOrderResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlaceOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wapgyj.common.proto.OrderProto.PlaceOrderReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wapgyj.common.proto.OrderProto.PlaceOrderResp.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("PlaceOrder"))
              .build();
        }
      }
    }
    return getPlaceOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wapgyj.common.proto.OrderProto.ListOrderReq,
      com.wapgyj.common.proto.OrderProto.ListOrderResp> getListOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrder",
      requestType = com.wapgyj.common.proto.OrderProto.ListOrderReq.class,
      responseType = com.wapgyj.common.proto.OrderProto.ListOrderResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wapgyj.common.proto.OrderProto.ListOrderReq,
      com.wapgyj.common.proto.OrderProto.ListOrderResp> getListOrderMethod() {
    io.grpc.MethodDescriptor<com.wapgyj.common.proto.OrderProto.ListOrderReq, com.wapgyj.common.proto.OrderProto.ListOrderResp> getListOrderMethod;
    if ((getListOrderMethod = OrderServiceGrpc.getListOrderMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getListOrderMethod = OrderServiceGrpc.getListOrderMethod) == null) {
          OrderServiceGrpc.getListOrderMethod = getListOrderMethod =
              io.grpc.MethodDescriptor.<com.wapgyj.common.proto.OrderProto.ListOrderReq, com.wapgyj.common.proto.OrderProto.ListOrderResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wapgyj.common.proto.OrderProto.ListOrderReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wapgyj.common.proto.OrderProto.ListOrderResp.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("ListOrder"))
              .build();
        }
      }
    }
    return getListOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wapgyj.common.proto.OrderProto.MarkOrderPaidReq,
      com.wapgyj.common.proto.OrderProto.MarkOrderPaidResp> getMarkOrderPaidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarkOrderPaid",
      requestType = com.wapgyj.common.proto.OrderProto.MarkOrderPaidReq.class,
      responseType = com.wapgyj.common.proto.OrderProto.MarkOrderPaidResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wapgyj.common.proto.OrderProto.MarkOrderPaidReq,
      com.wapgyj.common.proto.OrderProto.MarkOrderPaidResp> getMarkOrderPaidMethod() {
    io.grpc.MethodDescriptor<com.wapgyj.common.proto.OrderProto.MarkOrderPaidReq, com.wapgyj.common.proto.OrderProto.MarkOrderPaidResp> getMarkOrderPaidMethod;
    if ((getMarkOrderPaidMethod = OrderServiceGrpc.getMarkOrderPaidMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getMarkOrderPaidMethod = OrderServiceGrpc.getMarkOrderPaidMethod) == null) {
          OrderServiceGrpc.getMarkOrderPaidMethod = getMarkOrderPaidMethod =
              io.grpc.MethodDescriptor.<com.wapgyj.common.proto.OrderProto.MarkOrderPaidReq, com.wapgyj.common.proto.OrderProto.MarkOrderPaidResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarkOrderPaid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wapgyj.common.proto.OrderProto.MarkOrderPaidReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wapgyj.common.proto.OrderProto.MarkOrderPaidResp.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("MarkOrderPaid"))
              .build();
        }
      }
    }
    return getMarkOrderPaidMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceStub>() {
        @java.lang.Override
        public OrderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceStub(channel, callOptions);
        }
      };
    return OrderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static OrderServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingV2Stub>() {
        @java.lang.Override
        public OrderServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return OrderServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingStub>() {
        @java.lang.Override
        public OrderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceBlockingStub(channel, callOptions);
        }
      };
    return OrderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceFutureStub>() {
        @java.lang.Override
        public OrderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceFutureStub(channel, callOptions);
        }
      };
    return OrderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void placeOrder(com.wapgyj.common.proto.OrderProto.PlaceOrderReq request,
        io.grpc.stub.StreamObserver<com.wapgyj.common.proto.OrderProto.PlaceOrderResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlaceOrderMethod(), responseObserver);
    }

    /**
     */
    default void listOrder(com.wapgyj.common.proto.OrderProto.ListOrderReq request,
        io.grpc.stub.StreamObserver<com.wapgyj.common.proto.OrderProto.ListOrderResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrderMethod(), responseObserver);
    }

    /**
     */
    default void markOrderPaid(com.wapgyj.common.proto.OrderProto.MarkOrderPaidReq request,
        io.grpc.stub.StreamObserver<com.wapgyj.common.proto.OrderProto.MarkOrderPaidResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarkOrderPaidMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OrderService.
   */
  public static abstract class OrderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OrderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OrderService.
   */
  public static final class OrderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OrderServiceStub> {
    private OrderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceStub(channel, callOptions);
    }

    /**
     */
    public void placeOrder(com.wapgyj.common.proto.OrderProto.PlaceOrderReq request,
        io.grpc.stub.StreamObserver<com.wapgyj.common.proto.OrderProto.PlaceOrderResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlaceOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOrder(com.wapgyj.common.proto.OrderProto.ListOrderReq request,
        io.grpc.stub.StreamObserver<com.wapgyj.common.proto.OrderProto.ListOrderResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void markOrderPaid(com.wapgyj.common.proto.OrderProto.MarkOrderPaidReq request,
        io.grpc.stub.StreamObserver<com.wapgyj.common.proto.OrderProto.MarkOrderPaidResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarkOrderPaidMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OrderService.
   */
  public static final class OrderServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<OrderServiceBlockingV2Stub> {
    private OrderServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.wapgyj.common.proto.OrderProto.PlaceOrderResp placeOrder(com.wapgyj.common.proto.OrderProto.PlaceOrderReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlaceOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wapgyj.common.proto.OrderProto.ListOrderResp listOrder(com.wapgyj.common.proto.OrderProto.ListOrderReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wapgyj.common.proto.OrderProto.MarkOrderPaidResp markOrderPaid(com.wapgyj.common.proto.OrderProto.MarkOrderPaidReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarkOrderPaidMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service OrderService.
   */
  public static final class OrderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OrderServiceBlockingStub> {
    private OrderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wapgyj.common.proto.OrderProto.PlaceOrderResp placeOrder(com.wapgyj.common.proto.OrderProto.PlaceOrderReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlaceOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wapgyj.common.proto.OrderProto.ListOrderResp listOrder(com.wapgyj.common.proto.OrderProto.ListOrderReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wapgyj.common.proto.OrderProto.MarkOrderPaidResp markOrderPaid(com.wapgyj.common.proto.OrderProto.MarkOrderPaidReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarkOrderPaidMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OrderService.
   */
  public static final class OrderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OrderServiceFutureStub> {
    private OrderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wapgyj.common.proto.OrderProto.PlaceOrderResp> placeOrder(
        com.wapgyj.common.proto.OrderProto.PlaceOrderReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlaceOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wapgyj.common.proto.OrderProto.ListOrderResp> listOrder(
        com.wapgyj.common.proto.OrderProto.ListOrderReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wapgyj.common.proto.OrderProto.MarkOrderPaidResp> markOrderPaid(
        com.wapgyj.common.proto.OrderProto.MarkOrderPaidReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarkOrderPaidMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLACE_ORDER = 0;
  private static final int METHODID_LIST_ORDER = 1;
  private static final int METHODID_MARK_ORDER_PAID = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLACE_ORDER:
          serviceImpl.placeOrder((com.wapgyj.common.proto.OrderProto.PlaceOrderReq) request,
              (io.grpc.stub.StreamObserver<com.wapgyj.common.proto.OrderProto.PlaceOrderResp>) responseObserver);
          break;
        case METHODID_LIST_ORDER:
          serviceImpl.listOrder((com.wapgyj.common.proto.OrderProto.ListOrderReq) request,
              (io.grpc.stub.StreamObserver<com.wapgyj.common.proto.OrderProto.ListOrderResp>) responseObserver);
          break;
        case METHODID_MARK_ORDER_PAID:
          serviceImpl.markOrderPaid((com.wapgyj.common.proto.OrderProto.MarkOrderPaidReq) request,
              (io.grpc.stub.StreamObserver<com.wapgyj.common.proto.OrderProto.MarkOrderPaidResp>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPlaceOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.wapgyj.common.proto.OrderProto.PlaceOrderReq,
              com.wapgyj.common.proto.OrderProto.PlaceOrderResp>(
                service, METHODID_PLACE_ORDER)))
        .addMethod(
          getListOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.wapgyj.common.proto.OrderProto.ListOrderReq,
              com.wapgyj.common.proto.OrderProto.ListOrderResp>(
                service, METHODID_LIST_ORDER)))
        .addMethod(
          getMarkOrderPaidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.wapgyj.common.proto.OrderProto.MarkOrderPaidReq,
              com.wapgyj.common.proto.OrderProto.MarkOrderPaidResp>(
                service, METHODID_MARK_ORDER_PAID)))
        .build();
  }

  private static abstract class OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wapgyj.common.proto.OrderProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderService");
    }
  }

  private static final class OrderServiceFileDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier {
    OrderServiceFileDescriptorSupplier() {}
  }

  private static final class OrderServiceMethodDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OrderServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (OrderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderServiceFileDescriptorSupplier())
              .addMethod(getPlaceOrderMethod())
              .addMethod(getListOrderMethod())
              .addMethod(getMarkOrderPaidMethod())
              .build();
        }
      }
    }
    return result;
  }
}
