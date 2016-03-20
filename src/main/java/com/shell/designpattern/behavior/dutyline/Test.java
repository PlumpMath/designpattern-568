/*
 * 文件名：[]
 * 版权：
 * 描述：
 * 修改人：shell
 * 修改时间：2016年3月20日
 * 修改内容：
 */
package com.shell.designpattern.behavior.dutyline;

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
		MyHandler handler1 = new MyHandler("handler1");
		MyHandler handler2 = new MyHandler("handler2");
		MyHandler handler3 = new MyHandler("handler3");
		
		handler1.setHandler(handler2);
		handler2.setHandler(handler3);
		
		handler1.operate();
	}
}
