package com.sms.tominoes.Category;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

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
	public List<CategoryModel> getAllCategory() {
		
		return service.getAllCategory();
	}
	
	@GetMapping("/getCategory")
	public Float getCategory( @RequestBody GetCategoryRequestModel getCategoryRequestBean) {
		try {
			
		float x = service.getCategory(getCategoryRequestBean.getName());
		return x;
		}
		catch (Exception e) {
			// TODO: handle exception
			return 0.0f;
		}
	}
	
	

}
