package com.sms.tominoes.Crust;


import org.springframework.data.mongodb.repository.MongoRepository;



public interface CrustRepository extends MongoRepository<CrustModel, String> {
 
	 public CrustModel findByName(String name);
	  

}
