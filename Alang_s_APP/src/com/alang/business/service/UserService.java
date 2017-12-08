package com.alang.business.service;

import java.util.List;

import com.alang.business.bo.User;
import com.alang.business.exceptios.UserException;

public interface UserService {
	
	public boolean registerUser(User user) throws UserException;
	public boolean updateUser(String userId,User user) throws UserException;
	public User getUserById(String userId) throws UserException;
	public List<User> getAllUsers() throws UserException;
}
