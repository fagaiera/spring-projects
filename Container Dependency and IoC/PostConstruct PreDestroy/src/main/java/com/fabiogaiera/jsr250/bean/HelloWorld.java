package com.fabiogaiera.jsr250.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {

    public void printMessage() {
        System.out.println("Hello World!");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Bean is going through postConstruct method");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Bean is going through preDestroy method");
    }

}