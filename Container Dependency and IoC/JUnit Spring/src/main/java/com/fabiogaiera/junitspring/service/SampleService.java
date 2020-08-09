package com.fabiogaiera.junitspring.service;

import com.fabiogaiera.junitspring.model.Order;

public interface SampleService {

    public Order getOrder(int id);

    public Order createOrder(Order order);

}