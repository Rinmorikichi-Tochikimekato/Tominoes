package com.sms.tominoes.user;

public class GetUserRequestBean {

	private String name;

	public GetUserRequestBean() {
		super();
	}

	public GetUserRequestBean(String name) {
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
