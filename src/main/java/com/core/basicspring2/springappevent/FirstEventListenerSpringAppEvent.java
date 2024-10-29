package com.core.basicspring2.springappevent;


import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class FirstEventListenerSpringAppEvent {

    @EventListener
    public void handleCustomer(CustomSpringEventSpringAppEvent event) {
        System.out.println("First event is listening: " + event.getMessage());
    }
}
