/*
 * 文件名：[]
 * 版权：
 * 描述：
 * 修改人：shell
 * 修改时间：2016年3月20日
 * 修改内容：
 */
package com.shell.designpattern.behavior.command;

/**
 * <一句话功能简述>
 * <命令发出者>
 * @author   shell
 * @version  [版本号,2016年3月20日]
 * @seee      
 * @since
 * @Deprecated
 */
public class Invoker {
	private Command command;
	
	public Invoker(Command command) {
		this.command = command;
	}
	
	public void action() {
		command.exe();
	}
}
