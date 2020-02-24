package com.sms.tominoes.Beans;

import java.util.List;
import com.sms.tominoes.Model.CrustModel;;

public class GetAllCrustResponseBean {

	List<CrustModel> list;

	public GetAllCrustResponseBean() {
		super();
	}

	public GetAllCrustResponseBean(List<CrustModel> list) {
		super();
		this.list = list;
	}

	public List<CrustModel> getList() {
		return list;
	}

	public void setList(List<CrustModel> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "GetAllCrustResponseBean [list=" + list + "]";
	}

}
