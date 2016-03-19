package com.shell.designpattern.bean;

public class Man implements Person {
	
	private String name;
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

}
