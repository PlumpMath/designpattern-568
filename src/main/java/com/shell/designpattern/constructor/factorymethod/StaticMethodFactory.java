package com.shell.designpattern.constructor.factorymethod;

import com.shell.designpattern.bean.Female;
import com.shell.designpattern.bean.Man;
import com.shell.designpattern.bean.Person;

public class StaticMethodFactory {
	
	public static Person createMan() {
		return new Man();
	}
	
	public static Person createFemale() {
		return new Female();
	}
	
	public static void main(String[] args) {
		Person person = StaticMethodFactory.createMan();
		System.out.println(person);
	}
}
