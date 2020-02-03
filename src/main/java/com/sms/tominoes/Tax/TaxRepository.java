package com.sms.tominoes.Tax;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface TaxRepository extends MongoRepository<TaxModel, String> {
 
	 public TaxModel findByName(String name);
	  

}
