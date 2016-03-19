package com.shell.designpattern.behavior.templatemethod;

public class Plus extends AbstractCalculator {

	@Override
	public int calcute(int opn1, int opn2) {
		return opn1 + opn2;
	}

}
