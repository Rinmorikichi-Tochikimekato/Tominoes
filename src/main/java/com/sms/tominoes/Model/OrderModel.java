package com.sms.tominoes.Model;

import java.time.LocalDate;
import java.util.List;

import javax.xml.crypto.Data;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OrderModel {

	@Id
	String id;
	String pizzaName;
	List<String> topings;
	String crustName;
	OrderPrice price;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate date;

	public OrderModel() { }

	public OrderModel(String pizzaName, List<String> topings, String crustName, OrderPrice price,LocalDate date) {
		super();
		this.pizzaName = pizzaName;
		this.topings = topings;
		this.crustName = crustName;
		this.price = price;
		this.date=date;
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "OrderModel [id=" + id + ", pizzaName=" + pizzaName + ", topings=" + topings + ", crustName=" + crustName
				+ ", price=" + price + ", date=" + date + "]";
	}

	

}
