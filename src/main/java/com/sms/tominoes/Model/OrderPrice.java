package com.sms.tominoes.Model;

public class OrderPrice {
	
	double cgst;
	double sgst;
	double basePrice;
	double totalPrice;
	
	public OrderPrice() { }

	public OrderPrice(double cgst, double sgst, double basePrice, double totalPrice) {
		super();
		this.cgst = cgst;
		this.sgst = sgst;
		this.basePrice = basePrice;
		this.totalPrice = totalPrice;
	}

	public double getCgst() {
		return cgst;
	}

	public void setCgst(double cgst) {
		this.cgst = cgst;
	}

	public double getSgst() {
		return sgst;
	}

	public void setSgst(double sgst) {
		this.sgst = sgst;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "OrderPrice [cgst=" + cgst + ", sgst=" + sgst + ", basePrice=" + basePrice + ", totalPrice=" + totalPrice
				+ "]";
	}
	
}
