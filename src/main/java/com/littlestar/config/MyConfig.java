package com.littlestar.config;

import com.littlestar.bean.Cat;
import com.littlestar.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingBean(name = "Tom")
public class MyConfig {

    @Bean
    public User user01(){
        User user = new User();
        user.setName("陈星");
        user.setAge(10);
        user.setMyCat(getCat());
        return user;
    }

    @Bean("Tom2")
    public Cat getCat(){
        return new Cat("Tom");
    }
}
