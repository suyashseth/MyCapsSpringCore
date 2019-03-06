package com.capgemini.dev.autowireanno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("PersonConfig.xml");
		//		AnnotationConfigApplicationContext ctx = 
		//		                     new  AnnotationConfigApplicationContext(PersonConfig.class);
		Person p = ctx.getBean("person",Person.class);
		p.getJob().doJob();
		ctx.close();

	}

}
