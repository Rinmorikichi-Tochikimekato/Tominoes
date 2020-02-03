package com.sms.tominoes.Order;

import java.util.List;

import org.springframework.data.annotation.Id;

public class OrderModel {

	@Id
	String id;
	String pizzaName;
	List<String> topings;
	String crustName;
	float cgst;
	float sgst;
	float price;
	
	
	public float getCgst() {
		return cgst;
	}



	public void setCgst(float cgst) {
		this.cgst = cgst;
	}



	public float getSgst() {
		return sgst;
	}

 

	public void setSgst(float sgst) {
		this.sgst = sgst;
	}


	public OrderModel() {}

	

	public OrderModel( String pizzaName, List<String> topings, String crustName, float cgst, float sgst,
			float price) {
		super();
		
		this.pizzaName = pizzaName;
		this.topings = topings;
		this.crustName = crustName;
		this.cgst = cgst;
		this.sgst = sgst;
		this.price = price;
	}



	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPizzaName() {
		return pizzaName;
	}


	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}


	public List<String> getTopings() {
		return topings;
	}


	public void setTopings(List<String> topings) {
		this.topings = topings;
	}


	public String getCrustName() {
		return crustName;
	}


	public void setCrustName(String crustName) {
		this.crustName = crustName;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "OrderModel [id=" + id + ", pizzaName=" + pizzaName + ", topings=" + topings + ", crustName=" + crustName
				+ ", cgst=" + cgst + ", sgst=" + sgst + ", price=" + price + "]";
	}


	


	
	

	
}
