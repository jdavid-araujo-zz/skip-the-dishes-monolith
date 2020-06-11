package com.david.dishes.domain.service;

import org.springframework.data.repository.NoRepositoryBean;

import com.david.dishes.domain.model.Company;

@NoRepositoryBean
public interface CompanyService extends BaseService<Company, Long> {

}
