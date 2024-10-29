package com.core.basicspring2.eventlistener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventExample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigEvent.class);
        EventPublisherBean eventPublisherBean = context.getBean(EventPublisherBean.class);
        eventPublisherBean.publishEvent("Hello this message from example event");
    }
}
