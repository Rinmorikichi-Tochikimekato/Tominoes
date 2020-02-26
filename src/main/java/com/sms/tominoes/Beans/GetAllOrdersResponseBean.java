package com.sms.tominoes.Beans;

import java.util.ArrayList;
import java.util.List;

import com.sms.tominoes.order.OrderModel;

public class GetAllOrdersResponseBean {

	List<OrderModel> list = new ArrayList<>();

	public GetAllOrdersResponseBean() {
		super();
	}

	public GetAllOrdersResponseBean(List<OrderModel> list) {
		super();
		this.list = list;
	}

	public List<OrderModel> getList() {
		return list;
	}

	public void setList(List<OrderModel> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "GetAllOrdersResponseBean [list=" + list + "]";
	}

}
