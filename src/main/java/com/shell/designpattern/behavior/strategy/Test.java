package com.shell.designpattern.behavior.strategy;

public class Test {
	public static void main(String[] args) {
		String exp = "8+9";
		Calculator calculator = new Plus();
		int result = calculator.calculate(exp);
		System.out.println(result);
	}
}
