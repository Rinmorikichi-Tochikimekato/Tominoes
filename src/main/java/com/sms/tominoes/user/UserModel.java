package com.sms.tominoes.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users_db")
public class UserModel {
	
	
	
	 @Id
	 private int userId;
	 
	private String username;
	
	private String password;
	
	
	
	public UserModel() {
		// TODO Auto-generated constructor stub
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public UserModel(String username, String password, int userId) {
		super();
		this.username = username;
		this.password = password;
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserModel [username=" + username + ", password=" + password + ", userId=" + userId + "]";
	}
	
	

}
