/*
 * 文件名：[]
 * 版权：
 * 描述：
 * 修改人：shell
 * 修改时间：2016年3月20日
 * 修改内容：
 */
package com.shell.designpattern.structure.bridge;

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
		 
        DriverManager driverManager = new MyDriverManager();
        Driver driver1 = new MysqlDriver();
        driverManager.setDriver(driver1);
        driverManager.connect();
 
        Driver driver2 = new DB2Driver();
        driverManager.setDriver(driver2);
        driverManager.connect();
 
    }
}
