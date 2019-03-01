package com.CStatistics.test.dao;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.CStatistics.dao.GetUserDao;
import com.CStatistics.pojo.User;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年2月9日下午9:38:24
 * 
 * @Description TODO 
 *	查看用户接口 Dao 测试
 */
public class GetUserTest {
	@Test
	public void getUsers() throws SQLException {
		GetUserDao dao = new GetUserDao();
		List<User> list = dao.getAllUser();
		for(User user : list) {
			System.out.println(user);
		}
	}
}
