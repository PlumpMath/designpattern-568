package com.shell.designpattern.behavior.observer;

/**
 * 被观察对象
 * 
 * @author xieyu
 */
public interface Subject {
	/* 增加观察者  */
	void addObserver(Observer observer);
	
	/* 删除观察者 */
	void removeObserver(Observer observer);
	
	/* 通知所有观察者 */
	void notifyObservers();
	
	/*执行的操作, 执行完操作之后要告诉观察者 */
	void operate();
}
