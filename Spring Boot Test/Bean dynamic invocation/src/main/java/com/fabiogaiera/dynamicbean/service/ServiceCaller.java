package com.fabiogaiera.dynamicbean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ServiceCaller {

    @Autowired
    private Map<String, SomeService> dynamicServiceImplementation;

    @Value("${service.name}")
    private String name;

    public SomeService getDynamicServiceImplementation() {
        return dynamicServiceImplementation.get(name);
    }

    public void invocationToSomeService() {
        getDynamicServiceImplementation().execute();
    }

}