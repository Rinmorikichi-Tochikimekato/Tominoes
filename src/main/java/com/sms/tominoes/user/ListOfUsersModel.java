package com.sms.tominoes.user;

import java.util.List;

public class ListOfUsersModel {
	
 List<UserModel> list;

 public ListOfUsersModel() {
	// TODO Auto-generated constructor stub
}
 
public List<UserModel> getList() {
	return list;
}

public void setList(List<UserModel> list) {
	this.list = list;
}

public ListOfUsersModel(List<UserModel> list) {
	super();
	this.list = list;
}

@Override
public String toString() {
	return "ListOfUsersModel [list=" + list + "]";
}
 

 

}
