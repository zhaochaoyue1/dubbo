package com.zcy.srpingboot.dubbo.comsumer.controller;

import com.zcy.springboot.dubbo.entity.User;
import com.zcy.srpingboot.dubbo.comsumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("/consumer/getUser")
    @ResponseBody
    public User getUser(){
        User user = consumerService.getUser();
        return user;
    }
}
