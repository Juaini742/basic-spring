package com.core.basicspring2.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


// circular dependency happen because every bean need dependency injection each other.
// the case like bellow sample.
@Service
public class ServiceDIA {

    private  final  ServiceDIB serviceDIB;

//    circular dependency injection
//    @Autowired
//    public ServiceDIA(ServiceDIB serviceDIB) {
//        this.serviceDIB = serviceDIB;
//    }

//    solving problem
    @Autowired
    public ServiceDIA(@Lazy ServiceDIB serviceDIB) {
        this.serviceDIB = serviceDIB;
    }

    public void doSomethingA() {
        System.out.println("ServiceDIA is doing something");
    }

}
@Service
class ServiceDIB {

    private  final  ServiceDIA serviceDIA;

    @Autowired
    public ServiceDIB(ServiceDIA serviceDIA) {
        this.serviceDIA = serviceDIA;
    }

    public void doSomethingB() {
        System.out.println("ServiceDIB is doing something");
    }

}
