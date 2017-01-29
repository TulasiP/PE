package org.panelcoder.dataaccesslayer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.Documented;

@Documented
@Constraint(validatedBy=GenderValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidGender 
{
	String message() default "Please mention valid gender; accepted genders are Male or Female or Others";
	
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
