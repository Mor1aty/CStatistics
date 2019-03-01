package com.CStatistics.test.dao;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.CStatistics.dao.GetRestDao;
import com.CStatistics.pojo.RestBack;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年2月9日下午8:49:32
 * 
 * @Description TODO 安排空课接口 Dao 测试
 */
public class GetRestTest {
	@Test
	public void getUsers() throws SQLException {
		GetRestDao dao = new GetRestDao();
		List<RestBack> list = dao.getUsers("02");
		for(RestBack rb : list) {
			System.out.println(rb);
		}
	}
}
