package com.zcy.srpingboot.dubbo.dubboprivider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboprividerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboprividerApplication.class, args);
    }

}
