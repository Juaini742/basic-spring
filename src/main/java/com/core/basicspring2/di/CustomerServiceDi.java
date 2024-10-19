package com.core.basicspring2.di;


import org.springframework.stereotype.Service;

@Service
public class CustomerServiceDi {

    public String getCustomInfo() {
        return "Customer Service Di";
    }
}
