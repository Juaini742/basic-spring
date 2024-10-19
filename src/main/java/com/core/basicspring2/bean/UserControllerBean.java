package com.core.basicspring2.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerBean {

    private final UserServiceBean userServiceBean;

    @Autowired
    public UserControllerBean(UserServiceBean userServiceBean) {
        this.userServiceBean = userServiceBean;
    }

    @GetMapping("/perform") // http://localhost:8080/perform
    public String performService() {
        userServiceBean.performService();
        return "Service performed!";
    }
}
