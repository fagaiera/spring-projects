package com.fabiogaiera.prometheus.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

}