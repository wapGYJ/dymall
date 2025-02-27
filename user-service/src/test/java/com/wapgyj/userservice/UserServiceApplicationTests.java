package com.wapgyj.userservice;


import com.wapgyj.userservice.mapper.UserMapper;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {
  @Autowired
  private UserMapper userMapper;

    @Test
    void contextLoads() {
        System.out.println(userMapper.selectById(1));
    }

}
