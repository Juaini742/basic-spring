package com.core.basicspring2.beanpostprocessor;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigBeanPostProcessor {

    @Bean
    public ProductBeanPostProcess productBean() {
        return  new ProductBeanPostProcess("Smartphone");
    }

    @Bean
    public CustomBeanPostProcess customBean() {
        return new CustomBeanPostProcess();
    }
}
