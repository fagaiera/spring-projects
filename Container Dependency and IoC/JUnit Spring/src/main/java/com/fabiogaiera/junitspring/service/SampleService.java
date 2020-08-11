package com.fabiogaiera.junitspring.service;

import com.fabiogaiera.junitspring.model.Order;

public interface SampleService {

    Order getOrder(int id);

    Order createOrder();

}