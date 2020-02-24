package com.sms.tominoes.Beans;

public class GetCrustByNameRequestBean {
	
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetCrustByNameRequestBean(String name) {
		super();
		this.name = name;
	}
	
	public GetCrustByNameRequestBean() {
		// TODO Auto-generated constructor stub
	}

}
