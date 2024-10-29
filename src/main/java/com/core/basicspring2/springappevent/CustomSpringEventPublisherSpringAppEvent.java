package com.core.basicspring2.springappevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventPublisherSpringAppEvent {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void publishEvent(String message) {
        CustomSpringEventSpringAppEvent event = new CustomSpringEventSpringAppEvent(this, message);
        eventPublisher.publishEvent(event);
        System.out.println("Event published: " + event);
    }
}
