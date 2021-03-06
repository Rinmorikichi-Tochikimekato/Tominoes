package com.sms.tominoes.user;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface UserRepository extends MongoRepository<UserModel, String> {
	
	public UserModel findByUsername(String name);

}
