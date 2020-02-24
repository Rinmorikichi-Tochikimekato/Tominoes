package com.sms.tominoes.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private SequenceGeneratingService sequenceGeneratorService;
	
	UserModel addUser(UserModel user){
		System.out.println("went to the service for the user");
		
		user.setUserId(sequenceGeneratorService.generateSequence("users_sequence"));
		System.out.println("set data to user");
		user.setUsername(user.getUsername());
		user.setPassword(user.getPassword());
		
		
		userRepository.save(user);
		return user;
		
		
	}

}
