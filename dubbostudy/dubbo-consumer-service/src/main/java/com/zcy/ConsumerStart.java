package com.zcy;

import com.zcy.service.ConsumerService;
import org.apache.dubbo.common.json.JSON;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerStart {
    public static void main(String[] args)throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        ConsumerService consumerService = applicationContext.getBean(ConsumerService.class);
        User userService = consumerService.getUserService(1L);
        System.out.println(JSON.json(userService));
        applicationContext.start();
        System.out.println("服务启动了");
    }
}
