package com.shell.designpattern.behavior.observer;

public class MySubject extends AbstractSubject {

	@Override
	public void operate() {
		System.out.println("update self");
		notifyObservers();
	}

}
