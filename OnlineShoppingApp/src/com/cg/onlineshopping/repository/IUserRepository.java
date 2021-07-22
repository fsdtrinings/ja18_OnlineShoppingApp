package com.cg.onlineshopping.repository;

import com.cg.onlineshopping.entities.User;

public interface IUserRepository {
	
	public boolean validateUser(String username,String password);
	
	public boolean addUser(User user);
	public boolean signIn();
	public boolean signOut();
	
	// all CURD Operations on User
	

}
