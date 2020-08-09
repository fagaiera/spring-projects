package com.fabiogaiera.crud.dao;

import com.fabiogaiera.crud.model.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PersonDAOImpl implements PersonDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addPerson(Person person) {
        entityManager.persist(person);
    }

    @Override
    public void updatePerson(Person person) {
        entityManager.merge(person);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Person> listPersons() {
        return (List<Person>) entityManager.createQuery("SELECT p FROM Person p").getResultList();
    }

    @Override
    public Person getPersonById(int id) {
        return (Person) entityManager.createQuery("SELECT p FROM Person p WHERE p.id = :id")
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public void removePerson(int id) {
        entityManager.createQuery("DELETE FROM Person p WHERE p.id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }

}