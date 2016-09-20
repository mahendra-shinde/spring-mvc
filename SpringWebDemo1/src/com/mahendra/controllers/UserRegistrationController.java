package com.mahendra.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mahendra.model.Person;

@Controller
@RequestMapping("/register.do")
public class UserRegistrationController {

	@RequestMapping(method=RequestMethod.GET)
	public String showForm(Map<String,Object> entries){
		entries.put("user", new Person());
		return "form";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String processForm(@ModelAttribute("user") Person person, Map<String,Object> entries){
		System.out.println("User request processing "+ person.getFirstName());
		entries.put("msg","New user added: "+person.getFirstName()+" "+ person.getLastName());
		return "success";
	}
	
}
