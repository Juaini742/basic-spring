package com.core.basicspring2.springappevent;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppEventExample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigSpringAppEvent.class);

        CustomSpringEventPublisherSpringAppEvent publish = context.getBean(CustomSpringEventPublisherSpringAppEvent.class);

        publish.publishEvent("Hello this is running from main file");
    }
}
