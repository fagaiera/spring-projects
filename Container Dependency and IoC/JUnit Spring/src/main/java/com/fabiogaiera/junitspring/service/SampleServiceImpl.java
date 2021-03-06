package com.fabiogaiera.junitspring.service;

import com.fabiogaiera.junitspring.model.Order;

import java.util.Date;
import java.util.Random;

public class SampleServiceImpl implements SampleService {

    @Override
    public Order getOrder(int id) {
        Order newOrder = new Order();
        newOrder.setOrderId(new Random().nextInt());
        newOrder.setSecurityCode("XYZ");
        newOrder.setOrderStatus("COMPLETED");
        newOrder.setOrderDate(new Date());
        newOrder.setDescription("This is the new XYZ order");
        return newOrder;
    }

    @Override
    public Order createOrder() {
        Order newOrder = new Order();
        newOrder.setOrderId(new Random().nextInt());
        newOrder.setSecurityCode("XYZ");
        newOrder.setOrderStatus("INITIATED");
        newOrder.setOrderDate(new Date());
        return newOrder;
    }

}