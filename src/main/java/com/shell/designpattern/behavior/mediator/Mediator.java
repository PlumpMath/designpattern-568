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
public class Mediator extends AbstractMediator {
	//中介者最重要的功能，来回奔波与各个同事之间  
    public void execute(String name, String method) {  
 
        if("self".equals(method)){  //各自做好分内事  
            if("ColleagueA".equals(name)) {  
                ColleagueA colleague = (ColleagueA)super.colleagues.get("ColleagueA");  
                colleague.self();  
            }else {  
                ColleagueB colleague = (ColleagueB)super.colleagues.get("ColleagueB");  
                colleague.self();  
            }  
        }else { //与其他同事合作  
            if("ColleagueA".equals(name)) {  
                ColleagueA colleague = (ColleagueA)super.colleagues.get("ColleagueA");  
                colleague.out();  
            }else {  
                ColleagueB colleague = (ColleagueB)super.colleagues.get("ColleagueB");  
                colleague.out();  
            }  
        }  
    }  
}
