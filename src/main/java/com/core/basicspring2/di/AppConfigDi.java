package com.core.basicspring2.di;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigDi {

    @Bean
    public CustomerServiceDi customerServiceDi() {
        return new CustomerServiceDi();
    }

    @Bean
    public OrderServiceDi orderServiceDi(CustomerServiceDi customerServiceDi) {
        return new OrderServiceDi(customerServiceDi);
    }
}
