package com.wapgyj.common.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: cart.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CartServiceGrpc {

  private CartServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "cart.CartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wapgyj.common.proto.CartProto.AddItemReq,
      com.wapgyj.common.proto.CartProto.AddItemResp> getAddItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddItem",
      requestType = com.wapgyj.common.proto.CartProto.AddItemReq.class,
      responseType = com.wapgyj.common.proto.CartProto.AddItemResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wapgyj.common.proto.CartProto.AddItemReq,
      com.wapgyj.common.proto.CartProto.AddItemResp> getAddItemMethod() {
    io.grpc.MethodDescriptor<com.wapgyj.common.proto.CartProto.AddItemReq, com.wapgyj.common.proto.CartProto.AddItemResp> getAddItemMethod;
    if ((getAddItemMethod = CartServiceGrpc.getAddItemMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getAddItemMethod = CartServiceGrpc.getAddItemMethod) == null) {
          CartServiceGrpc.getAddItemMethod = getAddItemMethod =
              io.grpc.MethodDescriptor.<com.wapgyj.common.proto.CartProto.AddItemReq, com.wapgyj.common.proto.CartProto.AddItemResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wapgyj.common.proto.CartProto.AddItemReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wapgyj.common.proto.CartProto.AddItemResp.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("AddItem"))
              .build();
        }
      }
    }
    return getAddItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wapgyj.common.proto.CartProto.GetCartReq,
      com.wapgyj.common.proto.CartProto.GetCartResp> getGetCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCart",
      requestType = com.wapgyj.common.proto.CartProto.GetCartReq.class,
      responseType = com.wapgyj.common.proto.CartProto.GetCartResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wapgyj.common.proto.CartProto.GetCartReq,
      com.wapgyj.common.proto.CartProto.GetCartResp> getGetCartMethod() {
    io.grpc.MethodDescriptor<com.wapgyj.common.proto.CartProto.GetCartReq, com.wapgyj.common.proto.CartProto.GetCartResp> getGetCartMethod;
    if ((getGetCartMethod = CartServiceGrpc.getGetCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getGetCartMethod = CartServiceGrpc.getGetCartMethod) == null) {
          CartServiceGrpc.getGetCartMethod = getGetCartMethod =
              io.grpc.MethodDescriptor.<com.wapgyj.common.proto.CartProto.GetCartReq, com.wapgyj.common.proto.CartProto.GetCartResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wapgyj.common.proto.CartProto.GetCartReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wapgyj.common.proto.CartProto.GetCartResp.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("GetCart"))
              .build();
        }
      }
    }
    return getGetCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wapgyj.common.proto.CartProto.EmptyCartReq,
      com.wapgyj.common.proto.CartProto.EmptyCartResp> getEmptyCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EmptyCart",
      requestType = com.wapgyj.common.proto.CartProto.EmptyCartReq.class,
      responseType = com.wapgyj.common.proto.CartProto.EmptyCartResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wapgyj.common.proto.CartProto.EmptyCartReq,
      com.wapgyj.common.proto.CartProto.EmptyCartResp> getEmptyCartMethod() {
    io.grpc.MethodDescriptor<com.wapgyj.common.proto.CartProto.EmptyCartReq, com.wapgyj.common.proto.CartProto.EmptyCartResp> getEmptyCartMethod;
    if ((getEmptyCartMethod = CartServiceGrpc.getEmptyCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getEmptyCartMethod = CartServiceGrpc.getEmptyCartMethod) == null) {
          CartServiceGrpc.getEmptyCartMethod = getEmptyCartMethod =
              io.grpc.MethodDescriptor.<com.wapgyj.common.proto.CartProto.EmptyCartReq, com.wapgyj.common.proto.CartProto.EmptyCartResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EmptyCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wapgyj.common.proto.CartProto.EmptyCartReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wapgyj.common.proto.CartProto.EmptyCartResp.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("EmptyCart"))
              .build();
        }
      }
    }
    return getEmptyCartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceStub>() {
        @java.lang.Override
        public CartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceStub(channel, callOptions);
        }
      };
    return CartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CartServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingV2Stub>() {
        @java.lang.Override
        public CartServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CartServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingStub>() {
        @java.lang.Override
        public CartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceBlockingStub(channel, callOptions);
        }
      };
    return CartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceFutureStub>() {
        @java.lang.Override
        public CartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceFutureStub(channel, callOptions);
        }
      };
    return CartServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addItem(com.wapgyj.common.proto.CartProto.AddItemReq request,
        io.grpc.stub.StreamObserver<com.wapgyj.common.proto.CartProto.AddItemResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddItemMethod(), responseObserver);
    }

    /**
     */
    default void getCart(com.wapgyj.common.proto.CartProto.GetCartReq request,
        io.grpc.stub.StreamObserver<com.wapgyj.common.proto.CartProto.GetCartResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCartMethod(), responseObserver);
    }

    /**
     */
    default void emptyCart(com.wapgyj.common.proto.CartProto.EmptyCartReq request,
        io.grpc.stub.StreamObserver<com.wapgyj.common.proto.CartProto.EmptyCartResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEmptyCartMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CartService.
   */
  public static abstract class CartServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CartServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CartService.
   */
  public static final class CartServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CartServiceStub> {
    private CartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceStub(channel, callOptions);
    }

    /**
     */
    public void addItem(com.wapgyj.common.proto.CartProto.AddItemReq request,
        io.grpc.stub.StreamObserver<com.wapgyj.common.proto.CartProto.AddItemResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCart(com.wapgyj.common.proto.CartProto.GetCartReq request,
        io.grpc.stub.StreamObserver<com.wapgyj.common.proto.CartProto.GetCartResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void emptyCart(com.wapgyj.common.proto.CartProto.EmptyCartReq request,
        io.grpc.stub.StreamObserver<com.wapgyj.common.proto.CartProto.EmptyCartResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEmptyCartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CartService.
   */
  public static final class CartServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CartServiceBlockingV2Stub> {
    private CartServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.wapgyj.common.proto.CartProto.AddItemResp addItem(com.wapgyj.common.proto.CartProto.AddItemReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wapgyj.common.proto.CartProto.GetCartResp getCart(com.wapgyj.common.proto.CartProto.GetCartReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wapgyj.common.proto.CartProto.EmptyCartResp emptyCart(com.wapgyj.common.proto.CartProto.EmptyCartReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEmptyCartMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CartService.
   */
  public static final class CartServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CartServiceBlockingStub> {
    private CartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wapgyj.common.proto.CartProto.AddItemResp addItem(com.wapgyj.common.proto.CartProto.AddItemReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wapgyj.common.proto.CartProto.GetCartResp getCart(com.wapgyj.common.proto.CartProto.GetCartReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wapgyj.common.proto.CartProto.EmptyCartResp emptyCart(com.wapgyj.common.proto.CartProto.EmptyCartReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEmptyCartMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CartService.
   */
  public static final class CartServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CartServiceFutureStub> {
    private CartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wapgyj.common.proto.CartProto.AddItemResp> addItem(
        com.wapgyj.common.proto.CartProto.AddItemReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wapgyj.common.proto.CartProto.GetCartResp> getCart(
        com.wapgyj.common.proto.CartProto.GetCartReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wapgyj.common.proto.CartProto.EmptyCartResp> emptyCart(
        com.wapgyj.common.proto.CartProto.EmptyCartReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEmptyCartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ITEM = 0;
  private static final int METHODID_GET_CART = 1;
  private static final int METHODID_EMPTY_CART = 2;

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
        case METHODID_ADD_ITEM:
          serviceImpl.addItem((com.wapgyj.common.proto.CartProto.AddItemReq) request,
              (io.grpc.stub.StreamObserver<com.wapgyj.common.proto.CartProto.AddItemResp>) responseObserver);
          break;
        case METHODID_GET_CART:
          serviceImpl.getCart((com.wapgyj.common.proto.CartProto.GetCartReq) request,
              (io.grpc.stub.StreamObserver<com.wapgyj.common.proto.CartProto.GetCartResp>) responseObserver);
          break;
        case METHODID_EMPTY_CART:
          serviceImpl.emptyCart((com.wapgyj.common.proto.CartProto.EmptyCartReq) request,
              (io.grpc.stub.StreamObserver<com.wapgyj.common.proto.CartProto.EmptyCartResp>) responseObserver);
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
          getAddItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.wapgyj.common.proto.CartProto.AddItemReq,
              com.wapgyj.common.proto.CartProto.AddItemResp>(
                service, METHODID_ADD_ITEM)))
        .addMethod(
          getGetCartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.wapgyj.common.proto.CartProto.GetCartReq,
              com.wapgyj.common.proto.CartProto.GetCartResp>(
                service, METHODID_GET_CART)))
        .addMethod(
          getEmptyCartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.wapgyj.common.proto.CartProto.EmptyCartReq,
              com.wapgyj.common.proto.CartProto.EmptyCartResp>(
                service, METHODID_EMPTY_CART)))
        .build();
  }

  private static abstract class CartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wapgyj.common.proto.CartProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CartService");
    }
  }

  private static final class CartServiceFileDescriptorSupplier
      extends CartServiceBaseDescriptorSupplier {
    CartServiceFileDescriptorSupplier() {}
  }

  private static final class CartServiceMethodDescriptorSupplier
      extends CartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CartServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CartServiceFileDescriptorSupplier())
              .addMethod(getAddItemMethod())
              .addMethod(getGetCartMethod())
              .addMethod(getEmptyCartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
