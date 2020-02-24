package com.sms.tominoes.Model;

import java.util.List;
import org.springframework.data.annotation.Id;

public class CategoryModel {

	@Id
	String id;
	String name;
	List<String> pizza;
	float price;

	public CategoryModel() { }

	public CategoryModel(String name, List<String> pizza, float price) {
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

	public float getprice() {
		return price;
	}

	public void setprice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CategoryModel [id=" + id + ", name=" + name + ", pizza=" + pizza + ", price=" + price + "]";
	}

}
