package com.capgemini.dev.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Person.xml");
		Person p = ctx.getBean(Person.class);
		p.getJob().dowork();
		ctx.close();
		
		
	}
}
