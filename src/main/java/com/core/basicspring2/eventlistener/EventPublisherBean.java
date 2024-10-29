package com.core.basicspring2.eventlistener;


import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventPublisherBean {

    private ApplicationEventPublisher applicationEventPublisher;

    public EventPublisherBean(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishEvent(String message) {
        System.out.println("publishEvent: " + message);
        CustomEvent custoEvent = new CustomEvent(this, message);
        applicationEventPublisher.publishEvent(custoEvent);
    }
}
