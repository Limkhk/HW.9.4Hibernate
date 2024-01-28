package ru.netology.hw9_4hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.netology.hw9_4hibernate.entity.Persons;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonCrudRepository extends JpaRepository<Persons, Long> {
    List<Persons> findByCityOfLiving(String city);

    List<Persons> findByAgeLessThanOrderByAgeAsc (int age);

    Optional<Persons> findByNameAndSurname (String name, String surname);

    @Query(value = "select p from Persons p where p.cityOfLiving = :cityOfLiving")
    List<Persons> findByCityOfLivingJpqlQuery (String cityOfLiving);

    @Query(value = "select p from Persons p where p.age < :age order by p.age asc")
    List<Persons> findByAgeJpqlQuery (int age);

    @Query(value = "select p from Persons p where p.name = :name and p.surname = :surname")
    Optional<Persons> findByAgeJpqlQuery (String name, String surname);

}
