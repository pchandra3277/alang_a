package com.alang.business.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.alang.business.bo.User;
import com.alang.business.exceptios.UserException;
import com.alang.business.service.UserService;
@Transactional(isolation=Isolation.READ_COMMITTED)
public class UserServiceImpl implements UserService{

	@Override
	public boolean registerUser(User user) throws UserException {
		return false;
	}

	@Override
	public boolean updateUser(String userId, User user) throws UserException {
		return false;
	}

	@Override
	public User getUserById(String userId) throws UserException {
		return null;
	}

	@Override
	public List<User> getAllUsers() throws UserException {
		return null;
	}

}
