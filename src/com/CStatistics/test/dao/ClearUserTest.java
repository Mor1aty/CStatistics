package com.CStatistics.test.dao;

import java.sql.SQLException;

import org.junit.Test;

import com.CStatistics.dao.ClearUserDao;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年2月11日下午6:44:52
 * 
 * @Description TODO 
 *清除普通用户信息接口Dao测试
 */
public class ClearUserTest {
	@Test
    public void clearUser() throws SQLException{
		ClearUserDao dao=new ClearUserDao();
		int t=dao.getClear();
		System.out.println(t);
	}
}
