package com.david.dishes.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tb_order")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Order implements Serializable {

	private static final long serialVersionUID = 5273042903112268347L;

	@Id
	@EqualsAndHashCode.Include
	private Long id;

	@Transient
	private BigDecimal value;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@ManyToOne
	@JoinColumn(name = "address_id")
	private Address address;

	@OneToMany(mappedBy = "order")
	private Set<OrderLog> orderLog = new HashSet<>();

	@OneToMany(mappedBy = "order")
	private Set<OrderItem> items = new HashSet<>();

	@Column(name = "created_at")
	@CreatedDate
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	@LastModifiedDate
	private LocalDateTime updatedAt;
}
