package com.zcy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProvideStart {
    public static void main(String[] args)throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:provide.xml");
        applicationContext.start();
        System.out.println("服务启动了");
        System.in.read();
    }
}
