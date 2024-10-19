package com.core.basicspring2.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiController {

    private final OrderServiceDi orderServiceDi;

    @Autowired
    public DiController(OrderServiceDi orderServiceDi) {
        this.orderServiceDi = orderServiceDi;
    }

    @GetMapping("/process-order") // http://localhost:8080/process-order
    public String processOrder() {
        return orderServiceDi.processOrder();
    }
}
