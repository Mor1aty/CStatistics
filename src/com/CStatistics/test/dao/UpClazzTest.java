package com.CStatistics.test.dao;

import java.sql.SQLException;

import org.junit.Test;

import com.CStatistics.dao.UpClazzDao;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年2月12日上午11:04:50
 * 
 * @Description TODO 导入班级接口Dao测试
 */
public class UpClazzTest {
	@Test
	public void getUpClazz() throws SQLException {
		UpClazzDao dao = new UpClazzDao();
		int y = dao.upClazz("计算机一班", "23");
		System.out.println(y);
	}
}
