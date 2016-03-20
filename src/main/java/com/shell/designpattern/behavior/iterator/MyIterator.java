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
public class MyIterator<T> implements Iterator<T> {
	
	private Collection<T> collection;
	private int position = -1;
	
	public MyIterator(Collection<T> collection) {
		this.collection = collection;
	}

	@Override
	public T previous() {
		if (position > 0) {
			position--;
		}
		return collection.get(position);
	}

	@Override
	public T next() {
		if (position < collection.size() - 1) {
			position++;
		}
		return collection.get(position);
	}

	@Override
	public boolean hasNext() {
		if (position < collection.size() - 1) {
			return true;
		}
		return false;
	}

	@Override
	public T first() {
		return collection.get(0);
	}

}
