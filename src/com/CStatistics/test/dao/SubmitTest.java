package com.CStatistics.test.dao;

import java.sql.SQLException;

import org.junit.Test;

import com.CStatistics.dao.SubmitDao;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年1月13日下午4:56:58
 * 
 * @Description TODO 提交空课接口Dao测试
 */

public class SubmitTest {
	@Test
	public void subMit() throws SQLException {
		SubmitDao dao = new SubmitDao();
		int i = dao.subMit("0_1_0_1_0", "2016188085");
		System.out.println(i);
	}

	@Test
	public void findMit() throws SQLException {
		SubmitDao dao = new SubmitDao();
		System.out.println(dao.findSub("2016188085"));
	}
}
