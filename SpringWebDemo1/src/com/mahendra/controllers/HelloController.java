package com.mahendra.controllers;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {

		String ip = arg0.getRemoteHost();
		Date date = new Date();
		String message = "Hello World!";
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("ip", ip);
		mv.addObject("date",date);
		mv.addObject("msg",message);
		
		return mv;
	}

}
