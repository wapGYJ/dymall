package com.wapgyj.userservice.controller;


import com.wapgyj.common.Result.Result;

import com.wapgyj.userservice.service.IUserService;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wapGYJ
 * @since 2025-01-31
 */
@RestController
@RequestMapping("/users")
public class UserController {


     private final IUserService userService;


    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public Result<Integer> register(@RequestParam String email, @RequestParam String password, @RequestParam String confirmPassword){
        int register = userService.register(email, password, confirmPassword);
        if (register == 3001){return  Result.fail(3001, "邮箱不能为空");}
        if (register == 3002){return  Result.fail(3002, "密码不能为空");}
        if (register == 3003){return  Result.fail(3003, "邮箱已被注册,请登录");}
        if (register == 3004){return  Result.fail(3004, "两次密码不一致");}
        if (register == 3005){return  Result.fail(3005, "注册失败");}

        return Result.success(register);
    }

    @PostMapping("/login")
    public Result<Integer> login(@RequestParam String email,@RequestParam String password){
        int login = userService.login(email, password);
        if(login==3001){return Result.fail(3001,"邮箱不能为空");}
        if (login==3002){return Result.fail(3002,"密码不能为空");}
        if(login==3006){return Result.fail(3006,"邮箱未注册");}
        if(login==3007){return Result.fail(3007,"密码错误");}
        return Result.success(login);
    }

}
