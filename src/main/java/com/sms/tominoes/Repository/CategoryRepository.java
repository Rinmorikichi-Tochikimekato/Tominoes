package com.sms.tominoes.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.sms.tominoes.Model.CategoryModel;
import com.sms.tominoes.Model.CrustModel;

public interface CategoryRepository extends MongoRepository<CategoryModel, String> {
	public CategoryModel findByName(String name);

}
