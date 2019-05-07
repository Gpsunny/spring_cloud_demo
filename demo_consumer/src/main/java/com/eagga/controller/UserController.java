package com.eagga.controller;

import com.eagga.domain.User;
import com.eagga.feignservice.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:luoyujia
 * Date:2019/5/7
 * Description:todo
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserFeignService userFeignService;

    @RequestMapping("/test")
    public String test(String test) {
        return userFeignService.test(test);
    }

    @RequestMapping("/user")
    public User user(User user) {
        user.setId(1L);
        user.setUsername("root");
        user.setPassword("root");
        return user;
    }

}
