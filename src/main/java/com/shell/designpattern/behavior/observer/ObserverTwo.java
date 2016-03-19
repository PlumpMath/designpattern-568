package com.shell.designpattern.behavior.observer;

public class ObserverTwo implements Observer {

	@Override
	public void update() {
		System.out.println("ObserverTwo has updated");
	}

}
