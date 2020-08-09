package com.fabiogaiera.springdata.service;

import com.fabiogaiera.springdata.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityRepository1 cityRepository1;

    @Autowired
    CityRepository2 cityRepository2;

    //Using CrudRepository
    @Override
    public Iterable<City> findAll1() {
        return cityRepository1.findAll();
    }

    //Using @RepositoryDefinition
    @Override
    public Iterable<City> findAll2() {
        return cityRepository2.findAll();
    }

}