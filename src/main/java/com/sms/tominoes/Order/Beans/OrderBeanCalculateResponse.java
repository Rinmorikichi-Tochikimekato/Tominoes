package com.sms.tominoes.Order.Beans;

import java.util.List;

public class OrderBeanCalculateResponse {
	String pizzaName;
	List<String> topings;
	String crustName;
	float price;
	
	public OrderBeanCalculateResponse() {
		super();
	}

	@Override
	public String toString() {
		return "OrderBeanCalculateResponse [pizzaName=" + pizzaName + ", topings=" + topings + ", crustName="
				+ crustName + ", price=" + price + "]";
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

	public OrderBeanCalculateResponse(String pizzaName, List<String> topings, String crustName, float price) {
		super();
		this.pizzaName = pizzaName;
		this.topings = topings;
		this.crustName = crustName;
		this.price = price;
	}
	
	
	
	
	
}
