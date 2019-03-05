package com.capgemini.dev.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SoftwareDeveloper implements Job, BeanNameAware,BeanPostProcessor{

	public void initM()
	{
		System.out.println("Initialization of Developer");
	}
	
	@Override
	public void dowork() {
		System.out.println("Code Code Code.......");
	}

	@Override
	public void setBeanName(String name) {
		
		System.out.println("Name of Bean:"+name);
		
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before Init");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After Init");
		return null;
	}

	
}
