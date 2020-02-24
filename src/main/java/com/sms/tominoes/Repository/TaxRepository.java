package com.sms.tominoes.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sms.tominoes.Model.TaxModel;


public interface TaxRepository extends MongoRepository<TaxModel, String> {
 
	 public TaxModel findByName(String name);
	  

}
