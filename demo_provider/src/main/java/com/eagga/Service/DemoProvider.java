package com.eagga.Service;

import com.eagga.api.Api;
import com.eagga.domain.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:luoyujia
 * Date:2019/5/7
 * Description:todo
 */
@RestController
public class DemoProvider implements Api {

    @Override
    public String test(@RequestParam String test) {
        return "测试" + test;
    }

    @Override
    public User user(@RequestBody User user) {
        if (user == null) {
            user = new User(1L, "root", "root");
        }
        return user;
    }
}
