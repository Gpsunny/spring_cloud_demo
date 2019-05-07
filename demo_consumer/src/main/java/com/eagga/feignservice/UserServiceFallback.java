package com.eagga.feignservice;

import com.eagga.domain.User;
import org.springframework.stereotype.Component;

/**
 * Author:luoyujia
 * Date:2019/5/7
 * Description:todo
 */
@Component
public class UserServiceFallback implements UserFeignService {
    @Override
    public String test(String test) {
        return "error";
    }

    @Override
    public User user(User user) {
        return user;
    }
}
