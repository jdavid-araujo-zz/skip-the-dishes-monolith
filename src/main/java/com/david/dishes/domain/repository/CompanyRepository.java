package com.david.dishes.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.dishes.domain.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
