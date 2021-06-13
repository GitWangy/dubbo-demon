package com.wxwk.client.server;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.wxwk.api.model.User;
import com.wxwk.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @project dubbo-demo
 * @className UserClient
 * @description
 * @author wangyu
 * @create 2021-06-13 12:45
 **/
@Component
public class UserClient implements CommandLineRunner {

    @Reference(interfaceClass = UserService.class)
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        User user = userService.getUserInfoById(1L);
        System.out.println(user);
    }
}
