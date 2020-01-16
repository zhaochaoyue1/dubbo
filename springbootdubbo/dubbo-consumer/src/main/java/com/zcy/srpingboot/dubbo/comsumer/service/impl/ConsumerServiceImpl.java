package com.zcy.srpingboot.dubbo.comsumer.service.impl;

import com.alibaba.fastjson.JSON;
import com.zcy.springboot.dubbo.entity.User;
import com.zcy.springboot.dubbo.service.UserService;
import com.zcy.srpingboot.dubbo.comsumer.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

@Slf4j
@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Reference(version="userService")
    private UserService userService;

    @Override
    public User getUser() {
        User user = userService.getUser(1L);
        log.info("dubbo-consumer,user = {}", JSON.toJSONString(user));
        return user;
    }
}
