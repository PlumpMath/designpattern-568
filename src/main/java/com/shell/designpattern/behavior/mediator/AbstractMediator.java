/*
 * 文件名：[]
 * 版权：
 * 描述：
 * 修改人：shell
 * 修改时间：2016年3月20日
 * 修改内容：
 */
package com.shell.designpattern.behavior.mediator;

import java.util.Hashtable;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * @author   shell
 * @version  [版本号,2016年3月20日]
 * @seee      
 * @since
 * @Deprecated
 */
public abstract class AbstractMediator {
	
	//中介者肯定需要保持有若干同事的联系方式  
    protected Hashtable<String, AbstractColleague> colleagues = new Hashtable<String, AbstractColleague>();  
 
    //中介者可以动态地与某个同事建立联系  
    public void addColleague(String name, AbstractColleague c) {  
        this.colleagues.put(name, c);  
    }     
 
    //中介者也可以动态地撤销与某个同事的联系  
    public void deleteColleague(String name) {  
        this.colleagues.remove(name);  
    }  
 
    //中介者必须具备在同事之间处理逻辑、分配任务、促进交流的操作  
    public abstract void execute(String name, String method); 
}
