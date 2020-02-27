package com.sms.tominoes.order;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Order_Number_Generator")
public class OrderNumberGeneratorModel {
	
	@Id
	private String id;
	private int seq;
	
	public OrderNumberGeneratorModel() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	@Override
	public String toString() {
		return "DatabaseSequence [id=" + id + ", seq=" + seq + "]";
	}

	public OrderNumberGeneratorModel(String id, int seq) {
		super();
		this.id = id;
		this.seq = seq;
	}
	
	

}
