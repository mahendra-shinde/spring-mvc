package com.mahendra.controllers;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		{"file:WebContent/WEB-INF/applicationContext.xml",
		"file:WebContent/WEB-INF/mahendra-servlet.xml"})
public class HelloControllerTest {

	@Autowired private HelloController controller; 
	@Test
	public void testDoSomething() {
		ModelAndView mv = controller.doSomething();
		//Expected view name 'welcome'
		//Compare that with actual
		assertEquals("welcome", mv.getViewName());
	}
	
}
