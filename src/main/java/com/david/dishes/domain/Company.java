package com.david.dishes.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tb_company")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Company implements Serializable {

	private static final long serialVersionUID = 2572642587593286666L;

	@Id
	@EqualsAndHashCode.Include
	private Long id;

	private String name;

	@OneToMany(mappedBy = "company")
	private Set<Product> products = new HashSet<>();

	@Column(name = "created_at")
	@CreatedDate
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	@LastModifiedDate
	private LocalDateTime updatedAt;
}
