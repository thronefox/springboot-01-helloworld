package com.littlestar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        System.out.println(run.containsBean("user01"));
        System.out.println("你又被修改了。。。。。");
        System.out.println("我从gitHub上直接修改的数据。。。。。");
    }
}
