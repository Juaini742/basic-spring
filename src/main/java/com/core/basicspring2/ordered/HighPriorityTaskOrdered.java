package com.core.basicspring2.ordered;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class HighPriorityTaskOrdered implements TaskOrdered, Ordered {

    @Override
    public void execute() {
        System.out.println("HighPriorityTaskOrdered execute");
    }

    @Override
    public int getOrder() {
        return  0;
    }
}
