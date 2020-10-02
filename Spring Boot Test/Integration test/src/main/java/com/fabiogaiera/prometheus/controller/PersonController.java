package com.fabiogaiera.prometheus.controller;

import com.fabiogaiera.prometheus.model.Person;
import com.fabiogaiera.prometheus.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private PersonService personService;

    @PostMapping
    public void newPerson(Person person) {
        personService.createPerson(person);
    }

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

}