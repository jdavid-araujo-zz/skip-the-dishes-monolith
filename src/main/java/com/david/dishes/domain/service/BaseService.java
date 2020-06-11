package com.david.dishes.domain.service;

import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseService<T, ID> {
	T save(T entity);

	T update(ID id, T entity);

	T findById(ID id);

	List<T> findAll(int page, int size);

	void deleteById(ID id);
}
