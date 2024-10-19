package com.core.basicspring2.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcess implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ProductBeanPostProcess) {
            System.out.println("Before initialize: " + beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ProductBeanPostProcess) {
            System.out.println("After initialize: " + beanName);

            ProductBeanPostProcess productBeanPostProcess = (ProductBeanPostProcess) bean;
            productBeanPostProcess.setName("Modified " + productBeanPostProcess.getName());
        }
        return bean;
    }
}
