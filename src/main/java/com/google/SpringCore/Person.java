package com.google.SpringCore;

public class Person {
	private int pid;
	private String name;
	
	public Person()
	{
		System.out.println("Person object has been created");
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}