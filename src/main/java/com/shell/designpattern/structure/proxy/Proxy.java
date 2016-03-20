/*
 * 文件名：[]
 * 版权：
 * 描述：
 * 修改人：shell
 * 修改时间：2016年3月20日
 * 修改内容：
 */
package com.shell.designpattern.structure.proxy;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * @author   shell
 * @version  [版本号,2016年3月20日]
 * @seee      
 * @since
 * @Deprecated
 */
public class Proxy implements Sourceable{
	private Source source;
	
	public Proxy() {
		this.source = new Source();
	}

	@Override
	public void method() {
		after();
		source.method();
		before();
	}
	
	private void after() {
        System.out.println("after proxy!");
    }
 
    private void before() {
        System.out.println("before proxy!");
    }

}
