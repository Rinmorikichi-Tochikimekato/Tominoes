package com.sms.tominoes.Beans;

import java.util.List;

public class CalculatePriceResponseBean {
	String pizzaName;
	List<String> topings;
	String crustName;
	double price;
	
	public CalculatePriceResponseBean() {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public CalculatePriceResponseBean(String pizzaName, List<String> topings, String crustName, double price2) {
		super();
		this.pizzaName = pizzaName;
		this.topings = topings;
		this.crustName = crustName;
		this.price = price2;
	}
	
	
	
	
	
}
