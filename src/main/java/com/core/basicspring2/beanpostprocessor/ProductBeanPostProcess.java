package com.core.basicspring2.beanpostprocessor;

public class ProductBeanPostProcess {

    private String name;

    public ProductBeanPostProcess(String name) {
        this.name = name;
    }

    // Getter dan setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "'}";
    }
}
