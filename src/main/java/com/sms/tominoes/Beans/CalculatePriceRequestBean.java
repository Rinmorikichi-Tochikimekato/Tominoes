package com.sms.tominoes.Beans;

import java.util.List;

public class CalculatePriceRequestBean {

	String pizzaName;
	List<String> topings;
	String crustName;

	public CalculatePriceRequestBean() {
		super();
	}

	public CalculatePriceRequestBean(String pizzaName, List<String> topings, String crustName) {
		super();
		this.pizzaName = pizzaName;
		this.topings = topings;
		this.crustName = crustName;
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

	@Override
	public String toString() {
		return "OrderBeanCalculateRequest [pizzaName=" + pizzaName + ", topings=" + topings + ", crustName=" + crustName
				+ "]";
	}
	
}
