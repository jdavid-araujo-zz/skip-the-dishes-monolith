package com.david.dishes.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.david.dishes.domain.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
