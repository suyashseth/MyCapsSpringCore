package com.capgemini.dev.autowire;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.capgemini.dev.autowireanno.Job;

@Component
public class Cat implements InitializingBean,DisposableBean,BeanClassLoaderAware{

	private String name = "tom";
	private String color = "Grey";
	
	@Autowired(required=false)
	@Qualifier("tom")
	private Animal ani;
	
	
	@PostConstruct
	public void customInit()
	{
		System.out.println("Custom Init Method");
	}
	
	@PreDestroy
	public void customDestroy()
	{
		System.out.println("Custom Destroy Method");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Animal getAni() {
		return ani;
	}
	public void setAni(Animal ani) {
		this.ani = ani;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", animal=" + ani + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Default Init Method");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Default Destroy method");
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		// TODO Auto-generated method stub
		System.out.println("Name of classloader = "+classLoader.toString());
	}
	
	
}
