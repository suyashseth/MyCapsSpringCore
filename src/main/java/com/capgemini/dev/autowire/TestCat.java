package com.capgemini.dev.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.dev.autowireanno.Person;

public class TestCat {
public static void main(String[] args) {
	
	AnnotationConfigApplicationContext ctx =
			                        new AnnotationConfigApplicationContext(CatConfig.class);
//	       Cat c =  ctx.getBean(Cat.class);
//	       c.getAni().getAnimal();
////	       Person p = ctx.getBean(Person.class);
////	       p.getJob().doJob()
	
	
	String [] beans = ctx.getBeanDefinitionNames();

	for(String bean:beans)
	{
		System.out.println(bean);
	}
	
	;
	       ctx.close();
}
}
