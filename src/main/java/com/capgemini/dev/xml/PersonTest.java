package com.capgemini.dev.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Person.xml");
		
		String [] beans = ctx.getBeanDefinitionNames();
		
		for(String bean:beans)
		{
			System.out.println(bean);
		}
		
		
		ctx.close();
		
		
		
	}
}
