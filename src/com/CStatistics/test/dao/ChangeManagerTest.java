package com.CStatistics.test.dao;

import java.sql.SQLException;

import org.junit.Test;

import com.CStatistics.dao.ChangeManagerDao;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年2月11日下午4:37:40
 * 
 * @Description TODO 修改管理员信息接口Dao测试
 */
public class ChangeManagerTest {
	@Test
	public void getChange() throws SQLException {
		ChangeManagerDao dao = new ChangeManagerDao();
		int s = dao.change("2017151012", 1, "dj", "01");
		System.out.println(s);
	}
}
