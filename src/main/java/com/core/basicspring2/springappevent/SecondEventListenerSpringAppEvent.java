package com.core.basicspring2.springappevent;


import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order
public class SecondEventListenerSpringAppEvent {

    @EventListener
    public  void handleCustomEvent(CustomSpringEventSpringAppEvent event) {
        System.out.println("Custom second event is listening: " +  event.getMessage());
    }
}
