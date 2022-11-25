package com.ramu;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserNameValidator implements ConstraintValidator<UserNameValidation, String> {

	@Override
	public boolean isValid(String userName, ConstraintValidatorContext context) {

		userName = userName.trim();
		if (userName.length() < 8)
			return false;
		int lowerCase = 0;
		int upperCase = 0;
		int digitCount = 0;
		int specialCount = 0;
		
		for(char ch:userName.toCharArray()) {
			if(ch >= 'a' && ch <='z')
				lowerCase++;
			else if(ch >='A' && ch <='Z')
				upperCase++;
			else if(ch>='0'&&ch<='9')
				digitCount++;
			else
				specialCount++;
		}
		
		if(lowerCase >0 && upperCase >0 && digitCount >0 && specialCount > 0)
			return true;
		return false;
	}

}
