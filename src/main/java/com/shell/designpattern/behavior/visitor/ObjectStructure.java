/*
 * 文件名：[]
 * 版权：
 * 描述：
 * 修改人：shell
 * 修改时间：2016年3月20日
 * 修改内容：
 */
package com.shell.designpattern.behavior.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * @author   shell
 * @version  [版本号,2016年3月20日]
 * @seee      
 * @since
 * @Deprecated
 */
public class ObjectStructure {
	public static List<Element> getList(){
        List<Element>list = new ArrayList<Element>();
        Random ran = new Random();
        for(int i = 0 ; i < 10 ; i ++){
            int a=ran.nextInt(100);
            if(a>50){
                list.add (new ConcreteElement1());
            }else{
                list.add (new ConcreteElement2());
            }
        }
        return list;
    }
}
