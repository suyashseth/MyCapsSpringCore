package com.capgemini.dev.autowireanno;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.capgemini.dev.autowire.Animal;
import com.capgemini.dev.autowire.Cat;

@Named("person")
public class Person {

	private int pid = 1;
	private String pname = "Varmaji";
	
	@Inject
	@Qualifier("dancer")
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
