package com.sms.tominoes.Beans;

import java.util.List;

public class GetCategoryResponseBean {

	String id;
	String name;
	List<String> pizza;
	double price;

	public GetCategoryResponseBean() {
		super();
	}

	public GetCategoryResponseBean(String name, List<String> pizza, float price) {
		super();
		this.name = name;
		this.pizza = pizza;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPizza() {
		return pizza;
	}

	public void setPizza(List<String> pizza) {
		this.pizza = pizza;
	}

	public double getprice() {
		return price;
	}

	public void setprice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CategoryModel [id=" + id + ", name=" + name + ", pizza=" + pizza + ", price=" + price + "]";
	}

}
