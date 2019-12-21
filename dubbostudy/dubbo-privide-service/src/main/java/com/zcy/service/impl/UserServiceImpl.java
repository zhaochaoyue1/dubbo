package com.zcy.service.impl;

import com.zcy.User;
import com.zcy.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserService(Long userId) {

        User build = User.builder().id(userId)
                .name("赵超越")
                .createTime(new Date())
                .desc("我叫赵超越").build();
        System.out.println("远程调用过来了");
        return build;
    }
}
