package com.alang.business.dao;

import java.util.List;

import com.alang.business.bo.User;

public interface UserDao {
	
	public boolean registerUser(User user) ;
	public boolean updateUser(String userId,User user) ;
	public User getUserById(String userId) ;
	public List<User> getAllUsers();

}
