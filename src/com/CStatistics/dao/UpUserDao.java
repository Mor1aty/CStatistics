package com.CStatistics.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.CStatistics.utils.JdbcUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年2月9日下午9:13:37
 * 
 * @Description TODO 导入用户信息接口 Dao
 */
public class UpUserDao {
	public void upUser(String clazz, String account, String name, int identity, int gender) throws SQLException {
		QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "insert into t_user(u_account,u_password,u_name,u_identity,u_gender,u_clazz,u_amount) values(?,?,?,?,?,?,?)";
		runner.update(sql, new Object[] {account,"123456",name,identity,gender,clazz,0});
	}
}
