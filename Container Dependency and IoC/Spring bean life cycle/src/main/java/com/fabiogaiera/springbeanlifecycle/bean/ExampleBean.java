package com.fabiogaiera.springbeanlifecycle.bean;

public interface ExampleBean {

    void initMethod();

    void destroyMethod();

    void postConstruct();

    void preDestroy();

    void printMessage();

}