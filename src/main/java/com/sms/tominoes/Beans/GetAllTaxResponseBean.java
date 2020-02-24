package com.sms.tominoes.Beans;

import java.util.List;
import com.sms.tominoes.Model.TaxModel;

public class GetAllTaxResponseBean {

	List<TaxModel> list;

	public GetAllTaxResponseBean() {
		super();
	}

	public GetAllTaxResponseBean(List<TaxModel> list) {
		super();
		this.list = list;
	}

	public List<TaxModel> getList() {
		return list;
	}

	public void setList(List<TaxModel> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "GetAllTaxResponseBean [list=" + list + "]";
	}

}
