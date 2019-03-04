package com.capgemini.dev.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cat {

	private String name = "tom";
	private String color = "Grey";
	
	@Autowired
	@Qualifier("tom")
	private Animal ani;
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
	
	
}
