package com.david.dishes.domain.service;

import org.springframework.data.repository.NoRepositoryBean;

import com.david.dishes.domain.model.Customer;

@NoRepositoryBean
public interface CustomerService extends BaseService<Customer, Long> {

}
