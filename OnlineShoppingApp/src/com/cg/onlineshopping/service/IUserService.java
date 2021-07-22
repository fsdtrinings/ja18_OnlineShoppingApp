package com.cg.onlineshopping.service;

import com.cg.onlineshopping.entities.User;

public interface IUserService {
	
	public boolean validateUser(String username,String password);
	
	public boolean addUser(User user);
	public boolean signIn();
	public boolean signOut();
	
	
	// all CURD Operations on User
	

}
