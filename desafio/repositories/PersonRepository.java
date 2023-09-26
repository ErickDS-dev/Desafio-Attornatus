package com.attornatus.desafio.repositories;

import com.attornatus.desafio.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
