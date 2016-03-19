package com.shell.designpattern.constructor.abstractfactory;

import com.shell.designpattern.bean.Female;
import com.shell.designpattern.bean.Person;

public class FemaleFactory implements Factory {

	@Override
	public Person createPerson() {
		return new Female();
	}

}
