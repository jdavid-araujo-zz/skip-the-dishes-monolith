package com.david.dishes.domain.resource.v1;

import java.io.Serializable;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.david.dishes.domain.model.Customer;
import com.david.dishes.domain.service.CustomerService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/customers")
public class CustomerResource implements Serializable {

	private static final long serialVersionUID = -1841034120732759589L;

	private CustomerService customerService;

	@ResponseStatus(value = HttpStatus.CREATED)
	@PostMapping
	public void save(@RequestBody Customer entity) {
		this.customerService.save(entity);
	}

	@ResponseStatus(value = HttpStatus.OK)
	@PutMapping(value = "/{id}", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public void update(@PathVariable(value = "id") Long id, @RequestBody Customer entity) {
		this.customerService.update(id, entity);
	}

	@ResponseStatus(value = HttpStatus.OK)
	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Customer> findAll(@RequestParam(value = "page", required = false, defaultValue = "0") int page,
			@RequestParam(value = "size", required = false, defaultValue = "10") int size) {
		return this.customerService.findAll(page, size);
	}
}
