package com.fabiogaiera.contextconfiguration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service2 {

    private Service1 service1;

    public String methodFromService2() {
        return service1.methodFromService1();
    }

    @Autowired
    public void setService1(Service1 service1) {
        this.service1 = service1;
    }

}