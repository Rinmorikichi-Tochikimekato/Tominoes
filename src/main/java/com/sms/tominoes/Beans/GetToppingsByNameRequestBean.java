package com.sms.tominoes.Beans;

public class GetToppingsByNameRequestBean {

	String name;

	public GetToppingsByNameRequestBean() {
		super();
	}

	public GetToppingsByNameRequestBean(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
