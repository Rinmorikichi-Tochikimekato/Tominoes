package com.sms.tominoes.Model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class ToppingsModel {

	@Id
	String id;
	public String name;
	public double price;
	
	public ToppingsModel() {}
	
	
	public ToppingsModel(String name, double price) {
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
		return "TopingsModel [id=" + id + ", name=" + name + ", price=" + price + "]";
	}


	
	
	
	
}
