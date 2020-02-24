package com.sms.tominoes.Beans;

public class GetTaxByNameRequestBean {
	public String name;

	public GetTaxByNameRequestBean() {
		super();
	}

	public GetTaxByNameRequestBean(String name) {
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
