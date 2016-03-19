package com.shell.designpattern.behavior.templatemethod;

public abstract class AbstractCalculator {
	
	/* 模板方法, 具体的操作由子类实现 */
	public int calcute(String exp, String opt) {
		int arrayInt[] = split(exp, opt);
		return calcute(arrayInt[0], arrayInt[1]);
	}
	
	/* 不要写成public,控制访问, 只能被子类看到 */
	abstract int calcute(int opn1, int opn2);
	
	public int[] split(String exp, String op) {
		String[] array = exp.split(op);
		int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
	} 
}
