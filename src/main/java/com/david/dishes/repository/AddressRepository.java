package com.david.dishes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.dishes.domain.Addresss;

public interface AddressRepository extends JpaRepository<Addresss, Long> {

}
