/*
 * 文件名：[]
 * 版权：
 * 描述：
 * 修改人：shell
 * 修改时间：2016年3月20日
 * 修改内容：
 */
package com.shell.designpattern.behavior.explain;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author shell
 * @version [版本号,2016年3月20日]
 * @seee
 * @since
 * @Deprecated
 */
public class Test {
	public static void main(String[] args) {
		// 计算9+2-8的值
		int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}
}
