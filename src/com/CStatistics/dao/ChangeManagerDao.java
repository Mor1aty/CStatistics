package com.CStatistics.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.CStatistics.utils.JdbcUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年2月11日下午4:23:06
 * 
 * @Description TODO 修改管理员信息接口Dao
 */
public class ChangeManagerDao {
	public int change(String u_name, int u_gender, String u_clazz,String u_account) throws SQLException {
		QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "update t_user set u_account=? u_name=? u_gender=? u_clazz=?";
		return runner.update(sql, new Object[] {u_name, u_gender, u_clazz, u_account });
	}
}
