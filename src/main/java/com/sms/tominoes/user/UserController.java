package com.sms.tominoes.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
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
	
	@GetMapping("/getAllUsers")
	public ListOfUsersModel getAllUers() {
		return userService.getAllUsers();
	}
	
	@PostMapping("/getUserByName")
	public int getUserByName(@RequestBody GetUserRequestBean userBean) {
		
		UserModel um= userService.getUserByName(userBean.getName());
		return um.getUserId();
	}
	
	@DeleteMapping("/deleteUserByName")
	public ResponseEntity<Object> deleteUser(@RequestBody GetUserRequestBean userBean) {
		UserModel user = userService.getUserByName(userBean.getName());
		
		if(userService.checkUser(userBean.getName())) {
			userService.deleteUser(user);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		
		
	}
	
	@PostMapping("/getUserObjectByName")
	public ResponseEntity<UserModel> getUserObjectByUsername(@RequestBody GetUserRequestBean nameRequest ){
		
		
		if(userService.checkUser(nameRequest.getName())) {
			return new ResponseEntity<UserModel> ( userService.getUserByName(nameRequest.getName()),HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		
	}
	
	
	
}
