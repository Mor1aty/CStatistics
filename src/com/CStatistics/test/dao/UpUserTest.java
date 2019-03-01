package com.CStatistics.test.dao;

import java.sql.SQLException;

import org.junit.Test;

import com.CStatistics.dao.UpUserDao;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年2月9日下午9:19:03
 * 
 * @Description TODO 
 *	导入用户信息接口 Dao 测试
 */
public class UpUserTest {
	@Test
	public void upUser() throws SQLException {
		UpUserDao dao = new UpUserDao();
		dao.upUser("01", "2016188004", "赵柳", 1, 0);
	}
}
