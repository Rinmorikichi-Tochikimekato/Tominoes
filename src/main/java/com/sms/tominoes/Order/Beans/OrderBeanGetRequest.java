package com.sms.tominoes.Order.Beans;

public class OrderBeanGetRequest {

	String id;

	public OrderBeanGetRequest() {
		super();
	}

	public OrderBeanGetRequest(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "OrderBeanGetRequest [id=" + id + "]";
	}
	
	
}
