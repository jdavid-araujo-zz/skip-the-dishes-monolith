package com.david.dishes.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tb_order_log")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class OrderLog implements Serializable {

	private static final long serialVersionUID = 4855861239263520903L;

	@Id
	@EqualsAndHashCode.Include
	private Long id;

	@Enumerated(EnumType.STRING)
	private String status;

	private String description;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;

	@Column(name = "created_at")
	@CreatedDate
	private LocalDateTime createdAt;

}
