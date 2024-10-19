package com.core.basicspring2.beanFactory;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigBeanFactory {

    @Bean
    public ProductBeanFactory productBean() {
        return new ProductBeanFactory("Laptop");
    }
}
