package com.wapgyj.common.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: payment.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PaymentServiceGrpc {

  private PaymentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "payment.PaymentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wapgyj.common.proto.PaymentProto.ChargeReq,
      com.wapgyj.common.proto.PaymentProto.ChargeResp> getChargeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Charge",
      requestType = com.wapgyj.common.proto.PaymentProto.ChargeReq.class,
      responseType = com.wapgyj.common.proto.PaymentProto.ChargeResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wapgyj.common.proto.PaymentProto.ChargeReq,
      com.wapgyj.common.proto.PaymentProto.ChargeResp> getChargeMethod() {
    io.grpc.MethodDescriptor<com.wapgyj.common.proto.PaymentProto.ChargeReq, com.wapgyj.common.proto.PaymentProto.ChargeResp> getChargeMethod;
    if ((getChargeMethod = PaymentServiceGrpc.getChargeMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getChargeMethod = PaymentServiceGrpc.getChargeMethod) == null) {
          PaymentServiceGrpc.getChargeMethod = getChargeMethod =
              io.grpc.MethodDescriptor.<com.wapgyj.common.proto.PaymentProto.ChargeReq, com.wapgyj.common.proto.PaymentProto.ChargeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Charge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wapgyj.common.proto.PaymentProto.ChargeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wapgyj.common.proto.PaymentProto.ChargeResp.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("Charge"))
              .build();
        }
      }
    }
    return getChargeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wapgyj.common.proto.PaymentProto.GetTransactionReq,
      com.wapgyj.common.proto.PaymentProto.GetTransactionResp> getGetTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransaction",
      requestType = com.wapgyj.common.proto.PaymentProto.GetTransactionReq.class,
      responseType = com.wapgyj.common.proto.PaymentProto.GetTransactionResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wapgyj.common.proto.PaymentProto.GetTransactionReq,
      com.wapgyj.common.proto.PaymentProto.GetTransactionResp> getGetTransactionMethod() {
    io.grpc.MethodDescriptor<com.wapgyj.common.proto.PaymentProto.GetTransactionReq, com.wapgyj.common.proto.PaymentProto.GetTransactionResp> getGetTransactionMethod;
    if ((getGetTransactionMethod = PaymentServiceGrpc.getGetTransactionMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getGetTransactionMethod = PaymentServiceGrpc.getGetTransactionMethod) == null) {
          PaymentServiceGrpc.getGetTransactionMethod = getGetTransactionMethod =
              io.grpc.MethodDescriptor.<com.wapgyj.common.proto.PaymentProto.GetTransactionReq, com.wapgyj.common.proto.PaymentProto.GetTransactionResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wapgyj.common.proto.PaymentProto.GetTransactionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wapgyj.common.proto.PaymentProto.GetTransactionResp.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("GetTransaction"))
              .build();
        }
      }
    }
    return getGetTransactionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaymentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceStub>() {
        @java.lang.Override
        public PaymentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceStub(channel, callOptions);
        }
      };
    return PaymentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static PaymentServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingV2Stub>() {
        @java.lang.Override
        public PaymentServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return PaymentServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaymentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingStub>() {
        @java.lang.Override
        public PaymentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceBlockingStub(channel, callOptions);
        }
      };
    return PaymentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaymentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceFutureStub>() {
        @java.lang.Override
        public PaymentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceFutureStub(channel, callOptions);
        }
      };
    return PaymentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void charge(com.wapgyj.common.proto.PaymentProto.ChargeReq request,
        io.grpc.stub.StreamObserver<com.wapgyj.common.proto.PaymentProto.ChargeResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChargeMethod(), responseObserver);
    }

    /**
     */
    default void getTransaction(com.wapgyj.common.proto.PaymentProto.GetTransactionReq request,
        io.grpc.stub.StreamObserver<com.wapgyj.common.proto.PaymentProto.GetTransactionResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PaymentService.
   */
  public static abstract class PaymentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PaymentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PaymentService.
   */
  public static final class PaymentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PaymentServiceStub> {
    private PaymentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceStub(channel, callOptions);
    }

    /**
     */
    public void charge(com.wapgyj.common.proto.PaymentProto.ChargeReq request,
        io.grpc.stub.StreamObserver<com.wapgyj.common.proto.PaymentProto.ChargeResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChargeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransaction(com.wapgyj.common.proto.PaymentProto.GetTransactionReq request,
        io.grpc.stub.StreamObserver<com.wapgyj.common.proto.PaymentProto.GetTransactionResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PaymentService.
   */
  public static final class PaymentServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<PaymentServiceBlockingV2Stub> {
    private PaymentServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.wapgyj.common.proto.PaymentProto.ChargeResp charge(com.wapgyj.common.proto.PaymentProto.ChargeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChargeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wapgyj.common.proto.PaymentProto.GetTransactionResp getTransaction(com.wapgyj.common.proto.PaymentProto.GetTransactionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service PaymentService.
   */
  public static final class PaymentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PaymentServiceBlockingStub> {
    private PaymentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wapgyj.common.proto.PaymentProto.ChargeResp charge(com.wapgyj.common.proto.PaymentProto.ChargeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChargeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wapgyj.common.proto.PaymentProto.GetTransactionResp getTransaction(com.wapgyj.common.proto.PaymentProto.GetTransactionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PaymentService.
   */
  public static final class PaymentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PaymentServiceFutureStub> {
    private PaymentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wapgyj.common.proto.PaymentProto.ChargeResp> charge(
        com.wapgyj.common.proto.PaymentProto.ChargeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChargeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wapgyj.common.proto.PaymentProto.GetTransactionResp> getTransaction(
        com.wapgyj.common.proto.PaymentProto.GetTransactionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHARGE = 0;
  private static final int METHODID_GET_TRANSACTION = 1;

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
        case METHODID_CHARGE:
          serviceImpl.charge((com.wapgyj.common.proto.PaymentProto.ChargeReq) request,
              (io.grpc.stub.StreamObserver<com.wapgyj.common.proto.PaymentProto.ChargeResp>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION:
          serviceImpl.getTransaction((com.wapgyj.common.proto.PaymentProto.GetTransactionReq) request,
              (io.grpc.stub.StreamObserver<com.wapgyj.common.proto.PaymentProto.GetTransactionResp>) responseObserver);
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
          getChargeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.wapgyj.common.proto.PaymentProto.ChargeReq,
              com.wapgyj.common.proto.PaymentProto.ChargeResp>(
                service, METHODID_CHARGE)))
        .addMethod(
          getGetTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.wapgyj.common.proto.PaymentProto.GetTransactionReq,
              com.wapgyj.common.proto.PaymentProto.GetTransactionResp>(
                service, METHODID_GET_TRANSACTION)))
        .build();
  }

  private static abstract class PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaymentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wapgyj.common.proto.PaymentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PaymentService");
    }
  }

  private static final class PaymentServiceFileDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier {
    PaymentServiceFileDescriptorSupplier() {}
  }

  private static final class PaymentServiceMethodDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PaymentServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PaymentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaymentServiceFileDescriptorSupplier())
              .addMethod(getChargeMethod())
              .addMethod(getGetTransactionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
