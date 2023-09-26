package com.attornatus.desafio.controllers;

import com.attornatus.desafio.entities.Person;
import com.attornatus.desafio.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/people")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return personRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Long id, @RequestBody Person updatedPerson) {
        Person existingPerson = personRepository.findById(id).orElse(null);
        if (existingPerson != null) {
            existingPerson.setName(updatedPerson.getName());
            existingPerson.setDateOfBirth(updatedPerson.getDateOfBirth());
            existingPerson.setAddresses(updatedPerson.getAddresses());
            return personRepository.save(existingPerson);
        }
        return null;
    }
}
