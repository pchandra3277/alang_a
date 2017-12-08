package com.alang.business.service.impl;

import java.util.List;

import com.alang.business.bo.User;
import com.alang.business.exceptios.UserException;
import com.alang.business.service.AdminServices;

public class AdminServiceImpl implements AdminServices {

	@Override
	public boolean registerUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(String userId, User user) throws UserException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUserById(String userId) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AssignUserRole(String userId, int roleType) throws Exception {
		// TODO Auto-generated method stub

	}

}
