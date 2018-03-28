package com.xy.girl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GirlApplication {

    public static void main(String[] args) {
        //Spring的启动
        //这个类要启动这个项目的话上面必须有@SpringBootApplication这个注解
        SpringApplication.run(GirlApplication.class, args);
    }
}
