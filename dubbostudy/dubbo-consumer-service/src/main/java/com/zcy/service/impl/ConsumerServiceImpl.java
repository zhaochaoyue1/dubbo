package com.zcy.service.impl;

import com.zcy.User;
import com.zcy.service.ConsumerService;
import com.zcy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Autowired
    private UserService userService;
    @Override
    public User getUserService(Long userId) {
        User user = userService.getUserService(userId);
        return user;
    }
}
