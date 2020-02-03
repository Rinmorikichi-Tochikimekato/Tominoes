package com.sms.tominoes.Crust;

import org.springframework.data.annotation.Id;

public class CrustModel {
   @Id
	String id;
	String name;
	float price;
	
	public CrustModel() {}
	
	public CrustModel(String name, float price) {
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CrustModel [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	
	
	
}
