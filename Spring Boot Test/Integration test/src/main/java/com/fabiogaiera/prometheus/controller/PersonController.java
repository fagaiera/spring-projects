package com.fabiogaiera.prometheus.controller;

import com.fabiogaiera.prometheus.model.Person;
import com.fabiogaiera.prometheus.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private PersonService personService;

    @PostMapping("/new")
    public ResponseEntity<Void> newPerson(@RequestBody Person person) {
        personService.createPerson(person);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

}