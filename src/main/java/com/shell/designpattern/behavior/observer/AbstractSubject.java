package com.shell.designpattern.behavior.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {
	
	// 用一个vector来保存所有的观察者对象
	private Vector<Observer> observers = new Vector<>();
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> enumerations = observers.elements();
		while (enumerations.hasMoreElements()) {
			enumerations.nextElement().update();
		}
	}

}
