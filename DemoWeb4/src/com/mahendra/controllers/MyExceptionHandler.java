package com.mahendra.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.InvalidPropertyException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ModelAndView handleExceptionAndShowCustomErrorPage
		(HttpServletRequest req,Exception ex){
		ModelAndView mv = new ModelAndView("errors");
		mv.addObject("exception",ex.getMessage());
		mv.addObject("url",req.getRequestURL());
		mv.addObject("address",req.getRemoteHost());
		return mv;
	}
	
	
}
