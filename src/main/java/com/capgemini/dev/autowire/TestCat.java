package com.capgemini.dev.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCat {
public static void main(String[] args) {
	
	AnnotationConfigApplicationContext ctx =
			                        new AnnotationConfigApplicationContext(CatConfig.class);
	       Cat c =  ctx.getBean(Cat.class);
	       c.getAni().getAnimal();
	       ctx.close();
}
}
