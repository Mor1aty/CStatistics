package com.CStatistics.test.dao;

import java.sql.SQLException;

import org.junit.Test;

import com.CStatistics.dao.LoginDao;
import com.CStatistics.pojo.User;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2018年12月7日下午6:07:54
 * 
 * @Description TODO 
 *	登录接口Dao测试
 */
public class LoginTest {
	// 获取用户信息测试
	@Test
	public void getUser() throws SQLException {
		LoginDao ld = new LoginDao();
		User user = ld.getUser("2016188085", "123456");
		System.out.println(user);
	}
}
