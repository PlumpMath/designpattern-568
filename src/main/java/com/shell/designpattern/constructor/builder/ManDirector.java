package com.shell.designpattern.constructor.builder;

import com.shell.designpattern.bean.Person;

public class ManDirector {
	public Person createPerson(Builder builder) {
		builder.buildName();
		return builder.createPerson();
	}
}
