package com.CStatistics.dao;

import java.sql.SQLException;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.MapHandler;

import com.CStatistics.pojo.User;
import com.CStatistics.utils.JdbcUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2018年12月7日下午5:52:32
 * 
 * @Description TODO 登录接口Dao
 */
public class LoginDao {
	// 获取用户信息
	public User getUser(String account, String password) throws SQLException {
		QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "select * from t_user where u_account = ? and u_password = ?;";
		User user = runner.query(sql, new BeanHandler<User>(User.class), new Object[] { account, password });
		return user;
	}
	
	public int getUserCount() throws SQLException {
		QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "SELECT COUNT(*) FROM t_user WHERE u_account = '2016188085';";
		Map<String, Object> is = runner.query(sql, new MapHandler());
		return Integer.parseInt(is.get("COUNT(*)").toString());
	}
}
