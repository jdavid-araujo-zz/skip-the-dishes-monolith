package com.david.dishes.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.dishes.domain.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
