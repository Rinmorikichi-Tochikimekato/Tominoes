package com.sms.tominoes.Beans;

import java.util.List;

import com.sms.tominoes.Model.ToppingsModel;

public class GetAllTopingsResponseBean {
	
	List<ToppingsModel> list;

	
	public GetAllTopingsResponseBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	public GetAllTopingsResponseBean(List<ToppingsModel> list) {
		super();
		this.list = list;
	}


	public List<ToppingsModel> getList() {
		return list;
	}


	public void setList(List<ToppingsModel> list) {
		this.list = list;
	}


	@Override
	public String toString() {
		return "GetAllTopingsResponseBean [list=" + list + "]";
	}
	
	
	
	
	
}
