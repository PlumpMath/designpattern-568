package com.shell.designpattern.behavior.observer;

public class ObserverOne implements Observer {

	@Override
	public void update() {
		System.out.println("ObserverOne has updated");
	}

}
