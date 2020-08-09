package com.fabiogaiera.beanpostprocessor.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MessageService {

    @PostConstruct
    public void init() {
        System.out.println("Inside init method");
    }

    public void print() {
        System.out.println("Hello World!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Inside destroy method");
    }

}