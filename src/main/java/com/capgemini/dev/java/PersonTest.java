package com.capgemini.dev.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonTest {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(PersonConfig.class);

//		Person p = ctx.getBean(Person.class);
//		System.out.println(p.getMailid());
//		System.out.println(p.getName());
//		p.getJob().dowork();

		String [] beans = ctx.getBeanDefinitionNames();

		for(String bean:beans)
		{
			System.out.println(bean);
		}



		ctx.close();


	}
}
