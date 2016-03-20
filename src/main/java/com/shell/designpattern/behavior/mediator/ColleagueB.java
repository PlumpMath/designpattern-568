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
public class ColleagueB extends AbstractColleague {
	
	public ColleagueB(AbstractMediator mediator) {  
        super(mediator);  
    }  
 
    public void self() {  
        System.out.println("同事B --> 做好自己分内的事情 ...");  
    }  
 
    public void out() {  
        System.out.println("同事B --> 请求同事A做好分内工作  ...");  
        super.mediator.execute("ColleagueA", "self");  
    } 
}
