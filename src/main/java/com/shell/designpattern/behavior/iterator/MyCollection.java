/*
 * 文件名：[]
 * 版权：
 * 描述：
 * 修改人：shell
 * 修改时间：2016年3月20日
 * 修改内容：
 */
package com.shell.designpattern.behavior.iterator;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * @author   shell
 * @version  [版本号,2016年3月20日]
 * @seee      
 * @since
 * @Deprecated
 */
public class MyCollection<T> implements Collection<T> {
	
	private T[] t;
	
	public MyCollection(T[] t) {
		this.t = t;
	}

	@Override
	public Iterator<T> iterator() {
		return new MyIterator<T>(this);
	}

	@Override
	public T get(int index) {
		return t[index];
	}

	@Override
	public int size() {
		return t.length;
	}

}
