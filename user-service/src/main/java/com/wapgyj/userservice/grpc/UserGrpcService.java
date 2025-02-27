package com.wapgyj.userservice.grpc;

import com.wapgyj.common.proto.UserProto;
import com.wapgyj.common.proto.UserServiceGrpc;

import com.wapgyj.userservice.service.IUserService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class UserGrpcService extends UserServiceGrpc.UserServiceImplBase {
    @Autowired
    private IUserService userService;

    @Override
    public void login(UserProto.LoginReq request, StreamObserver<UserProto.LoginResp> responseObserver) {
        //调用服务
        int userId = userService.login(request.getEmail(), request.getPassword());
        //构建resp并返回
        UserProto.LoginResp resp = UserProto.LoginResp.newBuilder().setUserId(userId).build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();

    }

    @Override
    public void register(UserProto.RegisterReq request, StreamObserver<UserProto.RegisterResp> responseObserver) {
     //调用服务
        int userId = userService.register(request.getEmail(), request.getPassword(), request.getConfirmPassword());

        //构建resp并返回
        UserProto.RegisterResp resp = UserProto.RegisterResp.newBuilder().setUserId(userId).build();

        responseObserver.onNext(resp);
        responseObserver.onCompleted();

    }
}
