package com.fabiogaiera.beanwithdifferentname.bean;

import org.springframework.stereotype.Component;

@Component("someBeanWithAnotherName")
public class SomeBeanImpl implements SomeBean {

    @Override
    public void methodFromSomeBean() {
        System.out.println("methodFromSomeBean");
    }

}