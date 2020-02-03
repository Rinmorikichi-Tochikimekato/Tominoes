package com.sms.tominoes.Toppings;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class ToppingsModel {

	@Id
	String id;
	String name;
	float price;
	
	public ToppingsModel() {}
	
	
	public ToppingsModel(String name, float price) {
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
		return "TopingsModel [id=" + id + ", name=" + name + ", price=" + price + "]";
	}


	
	
	
	
}
