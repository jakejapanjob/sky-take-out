package com.sky;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement //开启注解方式的事务管理
@Slf4j
public class SkyApplication {
   /* 先启动nginx，位置在C:\demoProject\20240201_project_demo_1.0\nginx-1.20.2，桌面也有快捷方式*/
   /* 前端数据封装成DTO对象->sql返回数据封装成entity对象->返回给前端数据封装成VO对象->返回格式result对象，*/
    public static void main(String[] args) {
        SpringApplication.run(SkyApplication.class, args);
        log.info("server started");
    }
}
