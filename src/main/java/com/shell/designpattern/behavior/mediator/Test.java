/*
 * 文件名：[]
 * 版权：
 * 描述：
 * 修改人：shell
 * 修改时间：2016年3月20日
 * 修改内容：
 */
package com.shell.designpattern.behavior.mediator;

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
		 
        //创建一个中介者  
        AbstractMediator mediator = new Mediator();  
 
        //创建两个同事  
        ColleagueA colleagueA = new ColleagueA(mediator);  
        ColleagueB colleagueB = new ColleagueB(mediator);  
 
        //中介者分别与每个同事建立联系  
        mediator.addColleague("ColleagueA", colleagueA);  
        mediator.addColleague("ColleagueB", colleagueB);  
 
        //同事们开始工作  
        colleagueA.self();  
        colleagueA.out();  
        System.out.println("======================合作愉快，任务完成！\n");  
 
        colleagueB.self();  
        colleagueB.out();  
        System.out.println("======================合作愉快，任务完成！");  
    }
}
