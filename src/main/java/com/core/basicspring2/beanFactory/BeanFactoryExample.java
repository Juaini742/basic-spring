package com.core.basicspring2.beanFactory;

import org.apache.naming.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanFactoryExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(AppConfigBeanFactory.class);

        // Take bean dari BeanFactory
        ProductBeanFactory product = (ProductBeanFactory) factory.getBean("productBean");
        System.out.println("Product from BeanFactory: " + product.getName());
    }
}
