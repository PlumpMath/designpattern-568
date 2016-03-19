package com.shell.designpattern.constructor.singleton;

public class Singleton {
	private static Singleton man;
	
	private Singleton(){}
	
	public static Singleton getInstance() {
		if (man == null) {
			synchronized (Singleton.class) {
				if (man == null) {
					man = new Singleton();
				}
			}
		}
		return man;
	}
}
