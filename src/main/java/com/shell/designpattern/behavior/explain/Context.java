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
 * <一句话功能简述>
 * <功能详细描述>
 * @author   shell
 * @version  [版本号,2016年3月20日]
 * @seee      
 * @since
 * @Deprecated
 */
public class Context {
	private int num1;
    private int num2;
 
    public Context(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
 
    public int getNum1() {
        return num1;
    }
 
    public void setNum1(int num1) {
        this.num1 = num1;
    }
 
    public int getNum2() {
        return num2;
    }
 
    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
