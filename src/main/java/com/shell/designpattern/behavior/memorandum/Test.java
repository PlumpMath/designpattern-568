/*
 * 文件名：[]
 * 版权：
 * 描述：
 * 修改人：shell
 * 修改时间：2016年3月20日
 * 修改内容：
 */
package com.shell.designpattern.behavior.memorandum;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * @author   shell
 * @version  [版本号,2016年3月20日]
 * @seee      
 * @since
 * @Deprecated
 */
public class Test {
	public static void main(String[] args) {
		Original original = new Original();
		original.setValue("xiexie");
		
		Storage storage = new Storage(original.createMemory());
		System.out.println("initial value:" + original.getValue());
		original.setValue("xieyu");
		System.out.println("modify value:" + original.getValue());
		
		original.restoreFromMemory(storage.getMemory());
		System.out.println("restore value:" + original.getValue()); 
	}
}
