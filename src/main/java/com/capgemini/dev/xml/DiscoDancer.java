package com.capgemini.dev.xml;

public class DiscoDancer implements Job{

	public void customInit()
	{
		System.out.println("Initialization of Discodancer");
	}
	public void customDestroy()
	{
		System.out.println("Destruction of Discodancer");
	}
	@Override
	public void dowork() {
		System.out.println("Dancing Dancing Dancing");
		
	}

}
