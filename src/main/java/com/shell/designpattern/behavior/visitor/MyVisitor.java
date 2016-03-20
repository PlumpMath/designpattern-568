/*
 * 文件名：[]
 * 版权：
 * 描述：
 * 修改人：shell
 * 修改时间：2016年3月20日
 * 修改内容：
 */
package com.shell.designpattern.behavior.visitor;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * @author   shell
 * @version  [版本号,2016年3月20日]
 * @seee      
 * @since
 * @Deprecated
 */
public class MyVisitor implements Visitor {

	@Override
	public void visit(ConcreteElement1 element) {
		element.doSomething();
	}

	@Override
	public void visit(ConcreteElement2 element) {
		element.doSomething();
	}

}
