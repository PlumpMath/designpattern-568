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
public abstract class AbstractColleague {
	protected AbstractMediator mediator;  
	 
    /**既然有中介者，那么每个具体同事必然要与中介者有联系，  
     * 否则就没必要存在于 这个系统当中，这里的构造函数相当  
     * 于向该系统中注册一个中介者，以取得联系  
     */
    public AbstractColleague(AbstractMediator mediator) {  
        this.mediator = mediator;  
    }  
 
    // 在抽象同事类中添加用于与中介者取得联系（即注册）的方法  
    public void setMediator(AbstractMediator mediator) {  
        this.mediator = mediator;  
    }  
}
