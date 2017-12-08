package com.alang.business.constant;

import java.util.Arrays;

public enum Role {
	
	JOB_SEEKER(1),EMPLOYER(2),AJENCY(3),ACADAMY_INSTITUTION(4),ADMIN(5);
	
	private int code;
	
	private Role(int code)
	{
		this.code=code;
	}
	
	public Role forCode(int code)
	{
		return Arrays.stream(Role.values()).filter(e->e.code==code).findFirst().get();
	}

}
