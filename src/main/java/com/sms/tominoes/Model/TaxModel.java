package com.sms.tominoes.Model;

import org.springframework.data.annotation.Id;

public class TaxModel {
	@Id
	String id;
	String name;
	double rate;

	public TaxModel() { }

	public TaxModel(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "TaxModel [id=" + id + ", name=" + name + ", rate=" + rate + "]";
	}

}
