package com.sms.tominoes.Beans;

import java.util.List;

public class PlaceOrderRequestBean {
	int userid;
	

	String pizzaName;
	List<String> topings;
	String crustName;
	double price;

	public PlaceOrderRequestBean() {
		super();
	}

	public PlaceOrderRequestBean(int userid, String pizzaName, List<String> topings, String crustName, double price) {
		super();
		this.userid = userid;
		this.pizzaName = pizzaName;
		this.topings = topings;
		this.crustName = crustName;
		this.price = price;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	@Override
	public String toString() {
		return "PlaceOrderRequestBean [userid=" + userid + ", pizzaName=" + pizzaName + ", topings=" + topings
				+ ", crustName=" + crustName + ", price=" + price + "]";
	}

	
}
