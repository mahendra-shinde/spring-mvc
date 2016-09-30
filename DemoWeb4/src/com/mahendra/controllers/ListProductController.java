package com.mahendra.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.mahendra.models.Product;
import com.mahendra.services.ProductService;

@Controller
public class ListProductController {
	
	@Autowired
	private ProductService service;
	
	
	public void setService(ProductService service) {
		this.service = service;
	}

	@RequestMapping(value="/list-product.do",method=RequestMethod.GET)
	protected ModelAndView method1(){		 
		ModelAndView mv = new ModelAndView("list");
		List<Product> products = service.getProducts();
		mv.addObject("productList", products);
		return mv;
	}

}
