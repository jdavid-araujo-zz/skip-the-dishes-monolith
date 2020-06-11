package com.david.dishes.domain.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tb_customer")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Customer implements Serializable {

	private static final long serialVersionUID = 4530839426855428197L;

	@Id
	@EqualsAndHashCode.Include
	private Long id;

	private String name;

	@Email
	private String email;

	private String phone;

	@OneToMany(mappedBy = "customer")
	private Set<Address> addresses = new HashSet<>();

	@OneToMany(mappedBy = "customer")
	private Set<Order> order = new HashSet<>();

	@Column(name = "created_at")
	@CreatedDate
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	@LastModifiedDate
	private LocalDateTime updatedAt;
}
