package com.fabiogaiera.contextconfiguration.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Service1 {

    @Value("${name.method1}")
    private String name;

    public String methodFromService1() {
        return String.format("%s%s", "Executing ", name);
    }

}