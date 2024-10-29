package com.core.basicspring2.springbootapp.controller;


import com.core.basicspring2.springbootapp.service.HelloServiceSpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerSpringApplication {


    private HelloServiceSpringApplication helloServiceSpringApplication;

    public HelloControllerSpringApplication(HelloServiceSpringApplication helloServiceSpringApplication) {
        this.helloServiceSpringApplication = helloServiceSpringApplication;
    }

    @GetMapping("spring-boot-application") // localhost://8080/spring-boot-application
    public String hello() {
        return "Hello Spring Boot Application";
    }
}
