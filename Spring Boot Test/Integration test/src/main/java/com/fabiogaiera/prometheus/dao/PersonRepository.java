package com.fabiogaiera.prometheus.dao;

import com.fabiogaiera.prometheus.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}