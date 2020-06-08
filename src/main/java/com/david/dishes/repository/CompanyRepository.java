package com.david.dishes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.dishes.domain.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
