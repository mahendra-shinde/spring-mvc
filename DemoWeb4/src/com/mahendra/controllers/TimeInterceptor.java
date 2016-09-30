package com.mahendra.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TimeInterceptor implements HandlerInterceptor {

	private long timeSpent;
	
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		timeSpent = System.currentTimeMillis() - timeSpent;
		System.out.println(":::: Time Spent on processing "+arg0.getRequestURI()
					+" was "+timeSpent + " nano seconds");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		timeSpent = System.currentTimeMillis(); //Use System.currentTimeMillis() for jdk1.5
		return true; //return 'false' when you want to REJECT request
	}

}
