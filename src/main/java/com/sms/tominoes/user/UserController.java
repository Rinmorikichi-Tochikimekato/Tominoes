package com.sms.tominoes.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	
	
	
	@Autowired
	UserService userService;
	
	@PostMapping("/addUser")
	public ResponseEntity<UserModel> addUser(@RequestBody UserModel user) {
		
						
				try {
					//System.out.println(order);
					return new ResponseEntity<UserModel> ( (userService.addUser(user)),HttpStatus.OK);
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
					return new ResponseEntity<UserModel>(HttpStatus.INTERNAL_SERVER_ERROR);
				}
	
	}
	
	
	
}
