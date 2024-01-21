package ru.netology.hw9_4hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.netology.hw9_4hibernate.services.Persons;

import java.util.List;

@Repository
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Persons> getPersonsByCity(String city) {
        return entityManager.createQuery("from Persons where cityOfLiving =:city", Persons.class)
                .setParameter("city", city)
                .getResultList();
    }
}
