package com.mahendra.controllers;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class HelloController {

	
	@RequestMapping(value="/hello.do",method=RequestMethod.GET)
	public ModelAndView doSomething(){
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("msg","Welcome to Spring MVC!");
		mv.addObject("Date",new Date());
		
		return mv;
	}

}
