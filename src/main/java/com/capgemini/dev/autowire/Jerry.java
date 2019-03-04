package com.capgemini.dev.autowire;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("jerry")
@Primary
public class Jerry implements Animal{

	@Override
	public void getAnimal() {
		System.out.println("This is jerry");
	}

	
}
