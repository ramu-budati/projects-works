package com.ramu.model;

import com.ramu.UserNameValidation;


public class Register {

	
	@UserNameValidation(message = "okok")
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
