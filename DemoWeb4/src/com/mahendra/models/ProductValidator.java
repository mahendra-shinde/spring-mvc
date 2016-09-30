package com.mahendra.models;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


@Component
public class ProductValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		//Return TRUE when target class is 'Product'
		//i.e. This validator MUST NOT BE USED with any other class 
		return arg0.equals(Product.class);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace
			(arg1, "name", "invalid.name","Please enter name of product");

		ValidationUtils.rejectIfEmptyOrWhitespace
			(arg1, "description", "invalid.description","Please provide description");
	
		
		Product target = (Product) arg0;
		if(target.getPrice() < 1 || target.getPrice()>100000)
			arg1.rejectValue("price", "invalid.price", "Price out of range!");
	}

}
