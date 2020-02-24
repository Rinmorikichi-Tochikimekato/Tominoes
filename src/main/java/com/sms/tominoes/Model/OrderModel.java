package com.sms.tominoes.Model;

import java.util.List;
import org.springframework.data.annotation.Id;

public class OrderModel {

	@Id
	String id;
	String pizzaName;
	List<String> topings;
	String crustName;
	OrderPrice price;

	public OrderModel() { }

	public OrderModel(String pizzaName, List<String> topings, String crustName, OrderPrice price) {
		super();
		this.pizzaName = pizzaName;
		this.topings = topings;
		this.crustName = crustName;
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

	public OrderPrice getPrice() {
		return price;
	}

	public void setPrice(OrderPrice price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderModel [id=" + id + ", pizzaName=" + pizzaName + ", topings=" + topings + ", crustName=" + crustName
				+ ", price=" + price + "]";
	}

}
