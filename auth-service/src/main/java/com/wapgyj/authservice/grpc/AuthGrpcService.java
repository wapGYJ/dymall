package com.wapgyj.authservice.grpc;

import com.wapgyj.authservice.util.JwtUtil;
import com.wapgyj.common.proto.AuthProto;
import com.wapgyj.common.proto.AuthServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class AuthGrpcService extends AuthServiceGrpc.AuthServiceImplBase {
    @Override
    public void deliverTokenByRPC(AuthProto.DeliverTokenReq request, StreamObserver<AuthProto.DeliveryResp> responseObserver) {
        //获取id
        int userId = request.getUserId();
        //获取token
        String token = JwtUtil.generateToken(userId);
        //构建resp
        AuthProto.DeliveryResp resp = AuthProto.DeliveryResp.newBuilder().setToken(token).build();
        //返回
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

    @Override
    public void verifyTokenByRPC(AuthProto.VerifyTokenReq request, StreamObserver<AuthProto.VerifyResp> responseObserver) {
        //获取token
        String token = request.getToken();
        //验证token
        boolean b = JwtUtil.validateToken(token);
        //构建resp并返回
        AuthProto.VerifyResp resp = AuthProto.VerifyResp.newBuilder().setRes(b).build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

    @Override
    public void getIdFromToken(AuthProto.GetIdFromTokenReq request, StreamObserver<AuthProto.GetIdFromTokenResp> responseObserver) {
        String token = request.getToken();
        int userIdFromToken = JwtUtil.getUserIdFromToken(token);
        //构建resp并返回
        AuthProto.GetIdFromTokenResp build = AuthProto.GetIdFromTokenResp.newBuilder().setUserId(userIdFromToken).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }
}
