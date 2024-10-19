package com.core.basicspring2.beanFactory;

public class ProductBeanFactory {

    private String name;

    public ProductBeanFactory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ProductBeanFactory{" +
                "name='" + name + '\'' +
                '}';
    }
}
