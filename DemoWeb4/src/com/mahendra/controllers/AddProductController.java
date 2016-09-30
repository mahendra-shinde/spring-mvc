package com.mahendra.controllers;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.InvalidPropertyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mahendra.models.Product;
import com.mahendra.models.ProductValidator;
import com.mahendra.services.ProductService;

@Controller
@RequestMapping("/add-product.do")
public class AddProductController {

	@Autowired private ProductService service;
	
	@Autowired private ProductValidator validator;
	
	@InitBinder 
	public void initBinder(WebDataBinder binder){
		//Inform WebDataBinder which validator to call
		binder.setValidator(validator);
		
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String showForm(Model map){
		//Create an Empty Product object
		Product p = new Product();
		p.setName("Unknown");
		map.addAttribute("product", p);
		return "form";
	}
	
	/* 
	 * Make sure Model Attribute "product" is validate
	 * before this method is invoked
	 * store all results of validation in "BindingResult"
	 * */
	@RequestMapping(method=RequestMethod.POST)
	public String sumbitForm
		(@Validated @ModelAttribute("product")Product product,
				BindingResult result,
				Model map){
		
		if(result.hasErrors()){
			return "form";
		}
		service.add(product);
		if(product.getPrice()==3)
			throw new RuntimeException("Product with price 3 Rs !!!");
		map.addAttribute("msg","New product successfuly added!");
		return "welcome";
	}

	
}
