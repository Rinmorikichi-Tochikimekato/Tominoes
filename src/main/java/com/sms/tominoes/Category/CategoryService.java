package com.sms.tominoes.Category;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

	CategoryService(){}
	
	@Autowired
	CategoryRepository category;
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	public void save(CategoryModel model) {
		category.save(model);
	}

	public List<CategoryModel> getAllCategory() {
		// TODO Auto-generated method stub
		return category.findAll();
		
	}

	public Float getCategory(String name) {
		// TODO Auto-generated method stub
		
		
		Criteria criteria = Criteria.where("pizza").is(name);
		org.springframework.data.mongodb.core.query.Query query = new org.springframework.data.mongodb.core.query.Query();
		query.addCriteria(criteria);
		return((mongoTemplate.find(query, CategoryModel.class)).get(0).getprice());
		
		
		
//		for(CategoryModel model : category.findAll()) {
//			
//			for(String pizzaName : model.pizza) {
//				if(pizzaName.contentEquals(name)) {
//					return model.price;
//				}
//			}
//		}
//		return null;
	}
	

	
}
