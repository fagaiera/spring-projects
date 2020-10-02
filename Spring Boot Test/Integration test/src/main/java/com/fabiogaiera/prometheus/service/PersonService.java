package com.fabiogaiera.prometheus.service;

import com.fabiogaiera.prometheus.dao.PersonRepository;
import com.fabiogaiera.prometheus.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public void createPerson(Person person) {
        personRepository.save(person);
    }

    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

}