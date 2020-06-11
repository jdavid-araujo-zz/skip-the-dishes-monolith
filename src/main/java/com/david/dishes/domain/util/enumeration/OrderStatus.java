package com.david.dishes.domain.util.enumeration;

public enum OrderStatus {

	O("ORDERED"), D("DELIVERED"), CO("COMPLETED"), C("CANCELED");

	public String value;

	OrderStatus(String value) {
		this.value = value;
	}
}
