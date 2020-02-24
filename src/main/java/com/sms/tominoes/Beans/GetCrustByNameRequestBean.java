package com.sms.tominoes.Beans;

public class GetCrustByNameRequestBean {

	public String name;

	
	public GetCrustByNameRequestBean() {
		super();
	}

	public GetCrustByNameRequestBean(String name) {
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
