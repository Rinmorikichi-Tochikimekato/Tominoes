package com.sms.tominoes.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.tominoes.Beans.GetAllCategoryResponseBean;
import com.sms.tominoes.Beans.GetCategoryRequestBean;
import com.sms.tominoes.Beans.GetCategoryResponseBean;
import com.sms.tominoes.Model.CategoryModel;
import com.sms.tominoes.Service.CategoryService;

import io.swagger.annotations.ApiOperation;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService service;
	
	@PostMapping("/addCategory")
	@ApiOperation(value="Posts the pizza list for a particular new Category",
			notes="Enter the details of the pizza and the new category that you want to add to the menu",
			response=CategoryModel.class)
	
	
	public CategoryModel addCategory(@Valid @RequestBody CategoryModel model) {
		
		service.save(model);
		System.out.println(model);
		return model;
	
	}

	@GetMapping("/getAllCategory")
	public GetAllCategoryResponseBean getAllCategory() {
		
		return service.getAllCategory();
	}
	
	@GetMapping("/getCategory")
	public GetCategoryResponseBean getCategory( @RequestBody GetCategoryRequestBean getCategoryRequestBean) {
		try {
			
	      return service.getCategory(getCategoryRequestBean.getName());
		
		}
		catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	

}
