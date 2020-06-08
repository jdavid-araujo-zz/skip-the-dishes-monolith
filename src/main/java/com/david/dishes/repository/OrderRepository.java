package com.david.dishes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.dishes.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
