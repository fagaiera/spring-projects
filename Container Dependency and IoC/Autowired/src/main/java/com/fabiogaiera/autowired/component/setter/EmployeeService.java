package com.fabiogaiera.autowired.component.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    @Autowired //Autowired with setter
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}