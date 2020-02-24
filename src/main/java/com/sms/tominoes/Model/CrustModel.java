package com.sms.tominoes.Model;

import org.springframework.data.annotation.Id;

public class CrustModel {
	@Id
	String id;
	public String name;
	public double price;

	public CrustModel() { }

	public CrustModel(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CrustModel [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
