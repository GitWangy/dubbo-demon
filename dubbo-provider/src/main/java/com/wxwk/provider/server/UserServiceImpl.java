package com.wxwk.provider.server;

import com.alibaba.dubbo.config.annotation.Service;
import com.wxwk.api.model.User;
import com.wxwk.api.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @project dubbo-demo
 * @className UserServiceImpl
 * @description
 * @author wangyu
 * @create 2021-06-13 11:46
 **/
@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {
    @Override
    public User getUserInfoById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("王五");
        user.setAge("18");
        return user;
    }
}
