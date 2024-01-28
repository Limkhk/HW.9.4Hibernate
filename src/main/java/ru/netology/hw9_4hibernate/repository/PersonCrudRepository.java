package ru.netology.hw9_4hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.hw9_4hibernate.entity.Persons;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonCrudRepository extends JpaRepository<Persons, Long> {
    List<Persons> findByCityOfLiving(String city);

    List<Persons> findByAgeLessThanOrderByAgeAsc (int age);

    Optional<Persons> findByNameAndSurname (String name, String surname);
}
