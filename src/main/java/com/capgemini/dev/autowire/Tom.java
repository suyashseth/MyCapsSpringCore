package com.capgemini.dev.autowire;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("tom")
@Primary
public class Tom implements Animal{

	@Override
	public void getAnimal() {
		System.out.println("This is Tom");
	}

}
