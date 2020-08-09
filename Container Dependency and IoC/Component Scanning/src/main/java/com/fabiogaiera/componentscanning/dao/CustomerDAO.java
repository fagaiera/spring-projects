package com.fabiogaiera.componentscanning.dao;

import com.fabiogaiera.componentscanning.model.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> findAll();

}