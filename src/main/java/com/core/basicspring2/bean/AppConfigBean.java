package com.core.basicspring2.bean;


import com.core.basicspring2.singleton.UserServiceSingleton;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigBean {

    @Bean
    public UserServiceSingleton userServiceSingleton() {
        return new UserServiceSingleton();
    }
}
