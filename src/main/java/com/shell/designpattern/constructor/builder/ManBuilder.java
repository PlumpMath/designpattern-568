package com.shell.designpattern.constructor.builder;

import com.shell.designpattern.bean.Man;
import com.shell.designpattern.bean.Person;

public class ManBuilder implements Builder {
	
	private Man man;
	
	@Override
	public void buildName() {
		man.setName("man's name");
	}

	@Override
	public Person createPerson() {
		return man;
	}

}
