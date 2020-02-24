package com.sms.tominoes.Beans;

public class UpdateRequestBean {

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
	
	
	public UpdateRequestBean(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public UpdateRequestBean() {
		// TODO Auto-generated constructor stub
	}
}
