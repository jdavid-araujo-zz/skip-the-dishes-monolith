package com.david.dishes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.dishes.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
