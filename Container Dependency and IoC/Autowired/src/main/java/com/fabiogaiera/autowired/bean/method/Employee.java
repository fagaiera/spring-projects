package com.fabiogaiera.autowired.bean.method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Employee {

    @Autowired //Autowired with field
    private Company company;

    @Value("Fabio Gaiera")
    private String name;

    private String nameAndCompany;

    @Autowired //Autowired with method
    public void concatNameWithCompanyName() {
        this.nameAndCompany = String.format("%s%s", this.name, this.company.getCompName());
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAndCompany() {
        return nameAndCompany;
    }

}