package com.fabiogaiera.springdata.service;

import com.fabiogaiera.springdata.model.City;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = City.class, idClass = Long.class)
public interface CityRepository2 {

    Iterable<City> findAll();

}