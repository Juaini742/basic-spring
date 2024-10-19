package com.core.basicspring2.di;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceDi {

    private  final CustomerServiceDi customerServiceDi;

    @Autowired
    public OrderServiceDi(CustomerServiceDi customerServiceDi) {
        this.customerServiceDi = customerServiceDi;
    }

    public String processOrder() {
        return "Order processed for: " + customerServiceDi.getCustomInfo();
    }


}
