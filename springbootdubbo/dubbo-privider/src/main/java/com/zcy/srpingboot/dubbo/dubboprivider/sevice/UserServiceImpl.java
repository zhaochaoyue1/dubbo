package com.zcy.srpingboot.dubbo.dubboprivider.sevice;

import com.zcy.springboot.dubbo.entity.User;
import com.zcy.springboot.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.Date;

@Service(version="userService",timeout = 2000)
@Component
public class UserServiceImpl implements UserService{
    @Override
    public User getUser(Long id) {
        if(id ==null){
            return null;
        }
        if(id.intValue() == 1){
            User user = User.builder()
                    .id(1)
                    .name("zcy")
                    .description("zcy是菜鸡")
                    .createTime(new Date())
                    .build();
            return user;
        }
        return null;
    }
}
