package com.CStatistics.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

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
 * @date 2019年2月9日下午9:32:11
 * 
 * @Description TODO 
 *	查看用户接口 Dao
 */
public class GetUserDao {
	public List<User> getAllUser() throws SQLException{
		QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "select u_account,u_name,u_identity,u_gender,c_name AS u_clazz,u_amount from t_user left join t_clazz on u_clazz = t_clazz.id";
		return runner.query(sql, new BeanListHandler<User>(User.class));
	}
}
