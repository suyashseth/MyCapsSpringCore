package com.capgemini.dev.autowireannotaions;

import javax.inject.Named;

import org.springframework.context.annotation.Primary;

@Named("dancer")
@Primary
public class DiscoDancer implements Job{

	@Override
	public void doJob() {
		System.out.println("Dancing Dancing");
	}

}
