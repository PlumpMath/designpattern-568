/*
 * 文件名：[]
 * 版权：
 * 描述：
 * 修改人：shell
 * 修改时间：2016年3月20日
 * 修改内容：
 */
package com.shell.designpattern.structure.component;

import java.util.ArrayList;
import java.util.List;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * @author   shell
 * @version  [版本号,2016年3月20日]
 * @seee      
 * @since
 * @Deprecated
 */
public class ConcreteCompany extends Company {
	 
    private List<Company> cList;
 
    public ConcreteCompany() {
        cList = new ArrayList();
    }
 
    public ConcreteCompany(String name) {
        super(name);
        cList = new ArrayList();
    }
 
    @Override
    protected void add(Company company) {
        cList.add(company);
    }
 
    @Override
    protected void display(int depth) {
 
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(new String(sb) + this.getName());
        for (Company c : cList) {
            c.display(depth + 2);
        }
    }
 
    @Override
    protected void romove(Company company) {
        cList.remove(company);
    }
}
