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
 * <一句话功能简述> <保存备忘录，不知道为什么要这个角色>
 * 
 * @author shell
 * @version [版本号,2016年3月20日]
 * @seee
 * @since
 * @Deprecated
 */
public class Storage {
	private Memory memory;

	public Storage(Memory memory) {
		this.memory = memory;
	}

	/**
	 * @return the memory
	 */
	public Memory getMemory() {
		return memory;
	}

	/**
	 * @param memory
	 *            the memory to set
	 */
	public void setMemory(Memory memory) {
		this.memory = memory;
	}

}
