package com.shell.designpattern.constructor.factorymethod;

import com.shell.designpattern.bean.Female;
import com.shell.designpattern.bean.Man;
import com.shell.designpattern.bean.Person;

public class MultiCreateMethodFactory {
	
	public Person createMan() {
		return new Man();
	}
	
	public Person createFemale() {
		return new Female();
	}
	
	public static void main(String[] args) {
		MultiCreateMethodFactory mcmf = new MultiCreateMethodFactory();
		Person person = mcmf.createMan();
		System.out.println(person);
	}
}
