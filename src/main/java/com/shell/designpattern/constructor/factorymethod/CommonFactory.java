package com.shell.designpattern.constructor.factorymethod;

import com.shell.designpattern.bean.Female;
import com.shell.designpattern.bean.Man;
import com.shell.designpattern.bean.Person;

/**
 * 普通工厂模式
 * 
 * @author xieyu
 */
public class CommonFactory {
	
	/**
	 * 如果Person接口有很多个实现, 那么就要写很多判断语句
	 * @param genter
	 * @return
	 */
	public Person createPerson(String genter) {
		if ("man".equals(genter)) {
			return new Man();
		}
		if ("female".equals(genter)) {
			return new Female();
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		CommonFactory cf = new CommonFactory();
		Person person = cf.createPerson("man");
		System.out.println(person.getClass());
	}
}
