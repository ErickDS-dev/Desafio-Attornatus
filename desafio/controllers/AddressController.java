package com.attornatus.desafio.controllers;

import com.attornatus.desafio.entities.Address;
import com.attornatus.desafio.entities.Person;
import com.attornatus.desafio.repositories.AddressRepository;
import com.attornatus.desafio.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/people/{personId}/addresses")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public List<Address> getAddressesForPerson(@PathVariable Long personId) {
        return personRepository.findById(personId)
                .map(Person::getAddresses)
                .orElse(null);
    }

    @PostMapping
    public Address createAddressForPerson(@PathVariable Long personId, @RequestBody Address address) {
        return personRepository.findById(personId).map(person -> {
            person.getAddresses().add(address);
            personRepository.save(person);
            return address;
        }).orElse(null);
    }

    @PutMapping("/{addressId}/set-main")
    public Address setMainAddressForPerson(@PathVariable Long personId, @PathVariable Long addressId) {
        return personRepository.findById(personId).map(person -> {
            for (Address address : person.getAddresses()) {
                    address.setMain(address.getId().equals(addressId));
            }

            personRepository.save(person);
            return addressRepository.findById(addressId).orElse(null);
        }).orElse(null);
    }
}
