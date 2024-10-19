package com.core.basicspring2.anotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerAnnotation {

    private final UserServiceAnnotation userServiceAnnotation;

    @Autowired
    public UserControllerAnnotation(UserServiceAnnotation userServiceAnnotation) {
        this.userServiceAnnotation = userServiceAnnotation;
    }

    @GetMapping("user") // http://localhost:8080/user?email=john.doe@example.com
    public UserAnnotation getUser(@RequestParam String email) {
        return userServiceAnnotation.findByEmail(email);
    }

}
