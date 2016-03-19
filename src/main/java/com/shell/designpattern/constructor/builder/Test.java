package com.shell.designpattern.constructor.builder;

import com.shell.designpattern.bean.Person;

public class Test {
	public static void main(String[] args) {
		ManDirector md = new ManDirector();
		Builder builder = new ManBuilder();
		Person person = md.createPerson(builder);
		System.out.println(person);
	}
}
