package com.capgemini.dev.autowireannotaions;

import javax.inject.Named;

import org.springframework.context.annotation.Primary;

@Named("singer")
@Primary
public class Singer implements Job{

	@Override
	public void doJob() {
		System.out.println("Singing singing Singing");
	}

}
