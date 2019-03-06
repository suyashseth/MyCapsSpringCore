package com.capgemini.dev.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Person implements BeanNameAware/*,BeanFactoryAware,InitializingBean 
,ApplicationContextAware,BeanPostProcessor,DisposableBean*/{

	private int id;
	private String name;
	//private Job job;
	
	
	public void customInit()
	{
		System.out.println("Bean Initialization");
	}
	
	public void customDestroy() {
		System.out.println("Bye Bye Im dying");
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}*/
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", job=" + "]";
	}
	@Override
	public void setBeanName(String name) {
		System.out.println("Name of Bean : "+name);
	}
//	@Override
//	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//
//		System.out.println("BeanFactory = "+beanFactory.toString());
// 		
//	}
//	@Override
//	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		System.out.println("Application Context = "+applicationContext);
//	}
//	@Override
//	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println(beanName);
//		return null;
//	}
//	@Override
//	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		return null;
//	}
//
//	@Override
//	public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("Bye Bye");
//	}
//
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("Bean is ini");
//		
//	}
	
	
}
