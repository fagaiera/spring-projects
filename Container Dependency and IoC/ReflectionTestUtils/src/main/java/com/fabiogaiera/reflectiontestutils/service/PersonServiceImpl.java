package com.fabiogaiera.reflectiontestutils.service;

import com.fabiogaiera.reflectiontestutils.model.Person;

public class PersonServiceImpl implements PersonService {

    @Override
    public Person newPerson() {
        return new Person();
    }

}