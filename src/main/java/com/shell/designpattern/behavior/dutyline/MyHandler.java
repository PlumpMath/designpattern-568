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
public class MyHandler extends AbstractHandler implements Handler {
	
	private String name;
	
	public MyHandler(String name) {
		this.name = name;
	}

	@Override
	public void operate() {
		System.out.println(name + " handled");
		if (getHandler() != null) {  // 这个条件的判断就是这种设计模式的核心，根据不同的条件分发给不同的对象去处理
			getHandler().operate();
		}
	}

}
