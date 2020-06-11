package com.david.dishes.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.dishes.domain.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
