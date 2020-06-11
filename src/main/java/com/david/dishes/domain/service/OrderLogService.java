package com.david.dishes.domain.service;

import org.springframework.data.repository.NoRepositoryBean;

import com.david.dishes.domain.model.OrderLog;

@NoRepositoryBean
public interface OrderLogService extends BaseService<OrderLog, Long> {

}
