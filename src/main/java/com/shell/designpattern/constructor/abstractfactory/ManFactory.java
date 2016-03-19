package com.shell.designpattern.constructor.abstractfactory;

import com.shell.designpattern.bean.Man;
import com.shell.designpattern.bean.Person;

public class ManFactory implements Factory {

	@Override
	public Person createPerson() {
		return new Man();
	}
	
}
