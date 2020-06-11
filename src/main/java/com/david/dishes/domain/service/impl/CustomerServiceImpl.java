package com.david.dishes.domain.service.impl;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.david.dishes.domain.model.Customer;
import com.david.dishes.domain.repository.CustomerRepository;
import com.david.dishes.domain.service.CustomerService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	@Override
	public Customer save(Customer entity) {
		return this.customerRepository.save(entity);
	}

	@Override
	public Customer update(Long id, Customer entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAll(int page, int size) {
		PageRequest pageRequest = PageRequest.of(page, size, Sort.Direction.DESC, "name");

		return this.customerRepository.findAll(pageRequest).getContent();
	}

	@Override
	public void deleteById(Long id) {
		this.customerRepository.deleteById(id);

	}

}
