/*
 * 文件名：[]
 * 版权：
 * 描述：
 * 修改人：shell
 * 修改时间：2016年3月20日
 * 修改内容：
 */
package com.shell.designpattern.structure.adapter.object;

import com.shell.designpattern.structure.adapter.Source;
import com.shell.designpattern.structure.adapter.Targetable;

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
		Source source = new Source();
		Targetable wrapper = new Wrapper(source);
		wrapper.method1();
		wrapper.method2();
	}
}
