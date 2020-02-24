package com.sms.tominoes.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;
import com.sms.tominoes.Beans.GetAllCategoryResponseBean;
import com.sms.tominoes.Beans.GetCategoryResponseBean;
import com.sms.tominoes.Model.CategoryModel;
import com.sms.tominoes.Model.CrustModel;
import com.sms.tominoes.Repository.CategoryRepository;

@Service
public class CategoryService {

	CategoryService() {
	}

	@Autowired
	CategoryRepository category;

	@Autowired
	MongoTemplate mongoTemplate;

	public void save(CategoryModel model) {
		category.save(model);
	}

	public GetAllCategoryResponseBean getAllCategory() {
		return new GetAllCategoryResponseBean(category.findAll());
	}

	public GetCategoryResponseBean getCategory(String name) {
		Criteria criteria = Criteria.where("pizza").is(name);
		org.springframework.data.mongodb.core.query.Query query = new org.springframework.data.mongodb.core.query.Query();
		query.addCriteria(criteria);
		CategoryModel model = ((mongoTemplate.find(query, CategoryModel.class)).get(0));
		return new GetCategoryResponseBean(model.getName(), model.getPizza(), model.getprice());

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
	public CategoryModel getbyName(String name) {
		return category.findByName(name);
	}
	public void removeCategory(CategoryModel cm) {
		category.delete(cm);
	}


}
