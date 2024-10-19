package com.core.basicspring2.singleton;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerSingleton {

    @Autowired
    private  UserServiceSingleton userServiceSingleton;

    @GetMapping("/perform") // http://localhost:8080/perform
    public String performService() {
        userServiceSingleton.performService();
        return  "Service Performed";
    }
}
