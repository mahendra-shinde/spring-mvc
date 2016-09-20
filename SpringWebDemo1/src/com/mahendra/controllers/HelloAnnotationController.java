package com.mahendra.controllers;

import java.util.Date;
import java.util.Map;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloAnnotationController {
	
	@RequestMapping(value="/hello2.do",method=RequestMethod.GET)
	public String process(Map model){
		String ip = null; //arg0.getRemoteHost();
		Date date = new Date();
		String message = "Hello World!";
		
		
		model.put("ip",ip);
		model.put("msg",message);
		model.put("date",date);
		
		return "page";
	}
}
