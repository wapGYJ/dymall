package com.wapgyj.userservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wapgyj.common.proto.AuthProto;
import com.wapgyj.common.proto.AuthServiceGrpc;
import com.wapgyj.userservice.model.User;
import com.wapgyj.userservice.mapper.UserMapper;
import com.wapgyj.userservice.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wapGYJ
 * @since 2025-01-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


@GrpcClient("auth-service")
private AuthServiceGrpc.AuthServiceBlockingStub authServiceBlockingStub;

    @Override
    public int register(String email, String password, String confirmPassword) {

        if (email == null || email.isEmpty()){
            //邮箱不能为空
            return 3001;
        }
         if (password==null||password.isEmpty()){
             //密码不能为空
             return 3002;
         }
        QueryWrapper<User> wrapper = new QueryWrapper<User>().eq("email", email);
        User one = this.getOne(wrapper);
        if (one!=null){
            //邮箱已被注册,请登录
            return 3003;
        }
        if(!Objects.equals(password, confirmPassword)){
            //两次密码不一致
            return 3004;
        }
        if(this.save(new User(password, email))){
            //注册成功
            AuthProto.DeliveryResp resp = authServiceBlockingStub.deliverTokenByRPC(AuthProto.DeliverTokenReq.newBuilder().
                    setUserId(this.getOne(wrapper).getId()).build());
            String token = resp.getToken();
            //
            AuthProto.GetIdFromTokenResp idFromToken = authServiceBlockingStub.getIdFromToken(AuthProto.GetIdFromTokenReq.newBuilder().setToken(token).build());


            return idFromToken.getUserId();
        }else {
            //注册失败
            return 3005;
        }
    }

    @Override
    public int login(String email, String password) {

        if (email == null || email.isEmpty()){
            //邮箱不能为空
            return 3001;
        }
        if (password == null || password.isEmpty()){
            //密码不能为空
            return 3002;
        }
        if (this.getOne(new QueryWrapper<User>().eq("email", email))==null){
            //邮箱未注册
            return 3006;
        }
        if (this.getOne(new QueryWrapper<User>().eq("email", email).eq("password", password))==null){
            //密码错误
            return 3007;
        }
        //签发token
        AuthProto.DeliveryResp resp = authServiceBlockingStub.deliverTokenByRPC(AuthProto.DeliverTokenReq.newBuilder()
                .setUserId(this.getOne(new QueryWrapper<User>().eq("email", email).eq("password", password)).getId())
                .build());

        return this.getOne(new QueryWrapper<User>().eq("email",email).eq("password",password)).getId();
    }
}
