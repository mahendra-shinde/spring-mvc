package com.mahendra.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mahendra.models.Product;

@Controller
public class FindProductController {

	
	@RequestMapping(value="/find.do",method=RequestMethod.GET,
			produces="application/json")
	public @ResponseBody Product find(){
		Product p = new Product();
		p.setName("Lifebouy");
		p.setDescription("Bath Soap");
		p.setPrice(25);
		p.setMfd(new Date());
		return p;
	}
}
