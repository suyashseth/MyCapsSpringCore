package com.capgemini.dev.java;

public class Singer implements Job
{
	@Override
	public void dowork() {
		System.out.println("Singing song");
	}

}
