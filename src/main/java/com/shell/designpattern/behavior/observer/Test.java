package com.shell.designpattern.behavior.observer;

public class Test {
	public static void main(String[] args) {
		Subject subject = new MySubject();
		subject.addObserver(new ObserverOne());
		subject.addObserver(new ObserverTwo());
		subject.operate();
	}
}
