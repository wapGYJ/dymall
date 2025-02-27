package com.wapgyj.paymentservice.grpc;


import com.wapgyj.common.proto.PaymentProto;
import com.wapgyj.common.proto.PaymentServiceGrpc;
import com.wapgyj.paymentservice.model.Payment;
import com.wapgyj.paymentservice.service.IPaymentService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;


import java.math.BigDecimal;

@GrpcService
public class PaymentGrpcService extends PaymentServiceGrpc.PaymentServiceImplBase {

    private final IPaymentService paymentService;

    public PaymentGrpcService(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void charge(PaymentProto.ChargeReq request, StreamObserver<PaymentProto.ChargeResp> responseObserver) {
        //获取参数
        float amount = request.getAmount();
        String orderId = request.getOrderId();
        int userId = request.getUserId();
        //调用service
        String s = paymentService.AliPay(userId, Integer.parseInt(orderId), new BigDecimal(amount));

        //构建发送response
        PaymentProto.ChargeResp build = PaymentProto.ChargeResp.newBuilder().setAlipayForm(s).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void getTransaction(PaymentProto.GetTransactionReq request, StreamObserver<PaymentProto.GetTransactionResp> responseObserver) {

        String orderId = request.getOrderId();
   //避免支付时间为空导致transaction.getPaymentTime().toString()为空
        Payment transaction = paymentService.transaction(Integer.parseInt(orderId));
        String paidAt = transaction.getPaymentTime() == null ? "null" : transaction.getPaymentTime().toString();


        PaymentProto.GetTransactionResp build = PaymentProto.GetTransactionResp.newBuilder().setTransactionId(String.valueOf(transaction.getTransactionId()))
                .setAmount(transaction.getAmount().floatValue())
                .setOrderId(orderId)
                .setPaidAt(paidAt)
                .setStatus(transaction.getPaymentStatus())
                .setTransactionId(String.valueOf(transaction.getTransactionId()))
                .build();

        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }
}
