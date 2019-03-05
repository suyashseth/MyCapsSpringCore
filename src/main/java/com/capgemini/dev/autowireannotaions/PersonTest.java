package com.capgemini.dev.autowireannotaions;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = 
		                     new  AnnotationConfigApplicationContext(PersonConfig.class);
		Person p = ctx.getBean("person",Person.class);
		p.getJob().doJob();
		ctx.close();
		
	}
	
}
