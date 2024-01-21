package ru.netology.hw9_4hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hw9_4hibernate.services.Persons;
import ru.netology.hw9_4hibernate.repository.PersonRepository;

import java.util.List;

@RestController
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> fetchCity(@RequestParam String city) {
        return personRepository.getPersonsByCity(city);
    }
}
