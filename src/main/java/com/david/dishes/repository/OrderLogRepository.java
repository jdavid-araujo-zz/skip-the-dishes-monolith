package com.david.dishes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.david.dishes.domain.OrderLog;

@Repository
public interface OrderLogRepository extends JpaRepository<OrderLog, Long> {

}
