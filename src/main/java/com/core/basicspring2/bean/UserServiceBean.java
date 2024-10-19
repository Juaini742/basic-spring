package com.core.basicspring2.bean;

import org.springframework.stereotype.Service;

@Service
public class UserServiceBean {

    public void performService() {
        System.out.println("User service is being performed.");
    }
}
