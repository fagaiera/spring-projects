package com.fabiogaiera.crud.dao;

import com.fabiogaiera.crud.model.Person;

import java.util.List;

public interface PersonDAO {

    void addPerson(Person p);

    void updatePerson(Person p);

    List<Person> listPersons();

    Person getPersonById(int id);

    void removePerson(int id);

}