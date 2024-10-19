package com.core.basicspring2.singleton;

public class SingletonBean {

    public void SingletonBean() {
        System.out.println("Singleton bean instance created");
    }

    public String getMessage() {
        return  "Hello from singleton bean!";
    }
}
