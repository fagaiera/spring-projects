package com.fabiogaiera.springbeanlifecycle.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ExampleBeanImpl implements ExampleBean, InitializingBean, DisposableBean {

    @Override
    public void initMethod() {
        System.out.println("ExampleBeanImpl is going through initMethod.");
    }

    @Override
    public void destroyMethod() {
        System.out.println("ExampleBeanImpl is going through destroyMethod.");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("ExampleBeanImpl is going through afterPropertiesSet.");
    }

    @Override
    public void destroy() {
        System.out.println("ExampleBeanImpl is going through destroy.");
    }

    @Override
    @PostConstruct
    public void postConstruct() {
        System.out.println("ExampleBeanImpl is going through postConstruct.");
    }

    @Override
    @PreDestroy
    public void preDestroy() {
        System.out.println("ExampleBeanImpl is going through preDestroy.");
    }

    @Override
    public void printMessage() {
        System.out.println("Hello from ExampleBeanImpl!");
    }

}