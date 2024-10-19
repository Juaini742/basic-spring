package com.core.basicspring2.singleton;

import org.springframework.stereotype.Service;

@Service
public class UserServiceSingleton {
    public void performService() {
        System.out.println("Service is being performed");
    }
}
