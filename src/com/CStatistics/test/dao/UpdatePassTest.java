package com.CStatistics.test.dao;

import java.sql.SQLException;

import org.junit.Test;

import com.CStatistics.dao.UpdatePassDao;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2018年12月16日下午7:36:11
 * 
 * @Description TODO 修改密码接口Dao测试
 */
public class UpdatePassTest {
	@Test
	public void updatePass() throws SQLException {
		UpdatePassDao up = new UpdatePassDao();
		int y = up.updatePass("2017151016", "123456", "456789");
		System.out.println(y);
	}
}
