package com.capgemini.dev.java;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

public class Person implements ApplicationContextAware {

	private int id;
	private String name;
	private String mailid;
	private Job job;
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
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mailid=" + mailid + ", job=" + job + "]";
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	System.out.println("ApplicationContext="+applicationContext);
		
	}
	
	
	public void init()
	{
		System.out.println("before init");
	}
	
	
	
}
