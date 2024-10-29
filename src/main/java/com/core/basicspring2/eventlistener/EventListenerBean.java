package com.core.basicspring2.eventlistener;


import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerBean {

    @EventListener
    public void handleCustomEvent(CustomEvent customEvent) {
        System.out.println("Received message from custom event: " + customEvent.getMessage());
    }
}
