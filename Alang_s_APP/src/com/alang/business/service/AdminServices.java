package com.alang.business.service;

public interface AdminServices extends UserService{
	
	public void AssignUserRole(String userId,int roleType) throws Exception;

}
