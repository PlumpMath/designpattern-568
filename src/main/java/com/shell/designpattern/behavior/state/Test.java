/*
 * 文件名：[]
 * 版权：
 * 描述：
 * 修改人：shell
 * 修改时间：2016年3月20日
 * 修改内容：
 */
package com.shell.designpattern.behavior.state;

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
		State state = new State();  
        Context context = new Context(state);  
 
        //设置第一种状态  
        state.setValue("state1");  
        context.method();  
 
        //设置第二种状态  
        state.setValue("state2");  
        context.method();  
	}
}
