package com.shell.designpattern.constructor.builder;

import com.shell.designpattern.bean.Person;

public interface Builder {
	void buildName();
	Person createPerson();
}
