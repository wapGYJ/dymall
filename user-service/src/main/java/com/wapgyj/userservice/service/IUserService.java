package com.wapgyj.userservice.service;

import com.wapgyj.userservice.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wapGYJ
 * @since 2025-01-31
 */

public interface IUserService extends IService<User> {

      int register(String email, String password, String confirmPassword);

      int login(String email, String password);
}
