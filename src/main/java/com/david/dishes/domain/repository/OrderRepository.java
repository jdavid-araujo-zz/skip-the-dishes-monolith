package com.david.dishes.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.dishes.domain.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
