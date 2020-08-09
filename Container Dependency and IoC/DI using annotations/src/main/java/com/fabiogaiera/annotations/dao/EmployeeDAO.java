package com.fabiogaiera.annotations.dao;

import com.fabiogaiera.annotations.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}