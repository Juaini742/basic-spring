package com.core.basicspring2.beanpostprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanExamplePostProcess {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigBeanPostProcessor.class);

        ProductBeanPostProcess productBeanPostProcess = context.getBean(ProductBeanPostProcess.class);
        System.out.println("Bean from post process: " + productBeanPostProcess.getName());
    }
}
