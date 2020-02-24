package com.sms.tominoes.Beans;

import java.util.List;
import com.sms.tominoes.Model.CategoryModel;

public class GetAllCategoryResponseBean {

	List<CategoryModel> categoryList;
	

	public GetAllCategoryResponseBean() {
		super();
	}

	public GetAllCategoryResponseBean(List<CategoryModel> categoryList) {
		super();
		this.categoryList = categoryList;
	}

	public List<CategoryModel> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<CategoryModel> categoryList) {
		this.categoryList = categoryList;
	}

	@Override
	public String toString() {
		return "CategoryBeanGetAllRequest [categoryList=" + categoryList + "]";
	}

}
