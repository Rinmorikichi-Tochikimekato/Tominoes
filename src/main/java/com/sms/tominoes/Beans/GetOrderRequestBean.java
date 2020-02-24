package com.sms.tominoes.Beans;

public class GetOrderRequestBean {

	String id;

	public GetOrderRequestBean() {
		super();
	}

	public GetOrderRequestBean(String id) {
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
