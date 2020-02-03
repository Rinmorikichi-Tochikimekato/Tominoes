package com.sms.tominoes.Toppings;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToppingsRepository extends MongoRepository<ToppingsModel, String>{
	
	public ToppingsModel findByName(String name); 

}
