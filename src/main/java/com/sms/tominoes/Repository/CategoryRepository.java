package com.sms.tominoes.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sms.tominoes.Model.CategoryModel;

public interface CategoryRepository extends MongoRepository<CategoryModel, String> {

	
}
