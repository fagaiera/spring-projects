package com.fabiogaiera.qualifier.service;

import com.fabiogaiera.qualifier.model.Animal;
import com.fabiogaiera.qualifier.model.Zoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    private Animal animal;
    private Zoo zoo;

    @Autowired
    public AnimalService(@Qualifier("deer") Animal animal, Zoo zoo) {
        this.animal = animal;
        this.zoo = zoo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Zoo getZoo() {
        return zoo;
    }

}