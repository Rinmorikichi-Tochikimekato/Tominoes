package com.sms.tominoes.Toppings;

public class UpdateRequestModel {

	String name;
	float price;
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
	
	
	public UpdateRequestModel(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public UpdateRequestModel() {
		// TODO Auto-generated constructor stub
	}
}
