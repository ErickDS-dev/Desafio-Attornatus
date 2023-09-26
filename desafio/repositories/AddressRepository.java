package com.attornatus.desafio.repositories;
import com.attornatus.desafio.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
