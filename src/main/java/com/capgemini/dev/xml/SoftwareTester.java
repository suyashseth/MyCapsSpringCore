package com.capgemini.dev.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SoftwareTester implements Job/*,BeanPostProcessor*/{

	public void customInit()
	{
		System.out.println("Initialization of SoftwareTester");
	}
	public void customDestroy()
	{
		System.out.println("Destruction of SoftwareTester");
	}
	@Override
	public void dowork() {
		System.out.println("Test test buggers.......");
		
	}
	/*@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}*/

	
}
