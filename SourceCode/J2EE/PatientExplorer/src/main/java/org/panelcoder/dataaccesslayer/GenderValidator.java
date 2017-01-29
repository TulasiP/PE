package org.panelcoder.dataaccesslayer;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GenderValidator implements ConstraintValidator<IsValidGender, String>{

	@Override
	public void initialize(IsValidGender validgender) {
		
		
	}

	@Override
	public boolean isValid(String gender, ConstraintValidatorContext ctx) {
		
		if(gender==null)
		{
		return false;
		}
		if(gender.matches("Male|Female|Others"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
