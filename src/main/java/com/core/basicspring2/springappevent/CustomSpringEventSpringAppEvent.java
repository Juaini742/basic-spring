package com.core.basicspring2.springappevent;

import org.springframework.context.ApplicationEvent;


public class CustomSpringEventSpringAppEvent extends ApplicationEvent {

    private final String message;

    public CustomSpringEventSpringAppEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return  this.message;
    }

}
