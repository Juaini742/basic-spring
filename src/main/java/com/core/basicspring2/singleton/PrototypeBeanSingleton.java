package com.core.basicspring2.singleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class PrototypeBeanSingleton {

    public String getMessage() {
        return  "Hello from singleton bean prototype!";
    }
}
