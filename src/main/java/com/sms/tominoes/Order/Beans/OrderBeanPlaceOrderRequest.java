package com.sms.tominoes.Order.Beans;

import java.util.List;

public class OrderBeanPlaceOrderRequest {

	String pizzaName;
	List<String> topings;
	String crustName;
	float price;
	public OrderBeanPlaceOrderRequest() {
		super();
	}
	
	
	
	@Override
	public String toString() {
		return "OrderBeanPlaceOrderRequest [pizzaName=" + pizzaName + ", topings=" + topings + ", crustName="
				+ crustName + ", price=" + price + "]";
	}



	public OrderBeanPlaceOrderRequest(String pizzaName, List<String> topings, String crustName, float price) {
		super();
		this.pizzaName = pizzaName;
		this.topings = topings;
		this.crustName = crustName;
		this.price = price;
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
	
	
	
}
