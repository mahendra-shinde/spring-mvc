package com.mahendra.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		{"file:WebContent/WEB-INF/applicationContext.xml",
		"file:WebContent/WEB-INF/mahendra-servlet.xml"})
@WebAppConfiguration //Mandatory!!!
public class HelloController2Test {

	@Autowired private WebApplicationContext context;
	private MockMvc mvc = null;
	
	@Before  //init method will be called before EVERY test method
	public void init (){
		//Build a simulated MVC Environment 
		mvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void test() {
		try {
			mvc.perform(MockMvcRequestBuilders.post("/hello.do"))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.view().name("welcome"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void test2() {
		try {
			mvc.perform(MockMvcRequestBuilders.post("/add-product.do")
					.param("name","abcd")
					.param("description","Useless product of the year!")
					.param("price", "250")
					.param("mfd","15/03/2016")
					)
				.andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.view().name("welcome"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	
}
