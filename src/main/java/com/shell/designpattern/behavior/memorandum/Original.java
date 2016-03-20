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
 * <原始类>
 * @author   shell
 * @version  [版本号,2016年3月20日]
 * @seee      
 * @since
 * @Deprecated
 */
public class Original {
	private String value;

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	/**
	 * 创建备忘录，并将想要保存的状态保存到备忘录中
	 * @return
	 */
	public Memory createMemory() {
		return new Memory(this.value);
	}
	
	/**
	 * 将保存在备忘录中的状态恢复出来
	 * @param memory
	 */
	public void restoreFromMemory(Memory memory) {
		this.value = memory.getValue();
	}
	
}
