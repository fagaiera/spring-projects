package com.fabiogaiera.springdata.service;

import com.fabiogaiera.springdata.model.City;

public interface CityService {

    Iterable<City> findAll1();

    Iterable<City> findAll2();

}