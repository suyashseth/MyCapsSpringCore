package com.capgemini.dev.autowireannotaions;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;

@Named("person")
public class Person {

	private int pid = 1;
	private String pname = "Varmaji";
	
	@Inject
	@Qualifier("singer")
	private Job job;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", job=" + job + "]";
	}
	
}
