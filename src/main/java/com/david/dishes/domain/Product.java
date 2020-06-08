package com.david.dishes.domain;

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

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tb_product")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Product implements Serializable {

	private static final long serialVersionUID = 5162132938337609066L;

	@Id
	@EqualsAndHashCode.Include
	private Long id;

	private String name;

	private String description;

	private BigDecimal value;

	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;

	@OneToMany(mappedBy = "product")
	private Set<OrderItem> items = new HashSet<>();

	@Column(name = "created_at")
	@CreatedDate
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	@LastModifiedDate
	private LocalDateTime updatedAt;
}
