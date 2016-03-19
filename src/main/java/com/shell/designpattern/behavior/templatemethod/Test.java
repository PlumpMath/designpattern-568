package com.shell.designpattern.behavior.templatemethod;

public class Test {
	public static void main(String[] args) {
		AbstractCalculator abstractCalculator = new Plus();
		int result = abstractCalculator.calcute("8+3", "\\+");
		System.out.println(result);
	}
}
