package ru.netology.hw9_4hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hw9_4hibernate.entity.Persons;
import ru.netology.hw9_4hibernate.repository.PersonCrudRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    private final PersonCrudRepository personCrudRepository;

    public PersonController(PersonCrudRepository personCrudRepository) {
        this.personCrudRepository = personCrudRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> fetchCity(@RequestParam String city) {
        return personCrudRepository.findByCityOfLiving(city);
    }

    @GetMapping("/persons/by-age")
    public List<Persons> fetchAge(@RequestParam int age) {
        return personCrudRepository.findByAgeLessThanOrderByAgeAsc(age);
    }

    @GetMapping("/persons/by-name-and-surname")
    public Optional<Persons> getPersonByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return personCrudRepository.findByNameAndSurname(name, surname);
    }
}
