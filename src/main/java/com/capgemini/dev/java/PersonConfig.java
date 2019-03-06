package com.capgemini.dev.java;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PersonConfig {

	@Bean
	public Person getPerson(@Qualifier("getDiscoDancer")Job job)
	{
		Person p = new Person();
		p.setId(101);
		p.setName("Shashi");
		p.setMailid("djshahshi@discodancer.com");
		p.setJob(job);
		return p;
	}
	
	@Primary
	@Bean
	public DiscoDancer getDiscoDancer()
	{
		return new DiscoDancer(); 
	}

	@Primary
	@Bean
	public Singer getSinger()
	{
		return new Singer();
	}	
	
}
	

