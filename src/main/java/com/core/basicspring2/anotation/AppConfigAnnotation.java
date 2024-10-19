package com.core.basicspring2.anotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigAnnotation {

    @Bean
    public UserServiceAnnotation userServiceAnnotation() {
        return new UserServiceAnnotation(userRepositoryAnnotation());
    }

    @Bean
    public UserRepositoryAnnotation userRepositoryAnnotation() {
        return  new UserRepositoryAnnotation();
    }
}
