package com.CStatistics.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.MapHandler;

import com.CStatistics.pojo.User;
import com.CStatistics.utils.DateUtil;
import com.CStatistics.utils.JdbcUtil;
import com.CStatistics.utils.UUIDUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年1月12日下午2:08:05
 * 
 * @Description TODO 提交空课接口Dao
 *
 */
public class SubmitDao {
	public User getUser(String account) throws SQLException {
		QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "select * from t_user where u_account = ?;";
		User user = runner.query(sql, new BeanHandler<User>(User.class), new Object[] { account });
		return user;
	}

	public int subMit(String rest, String account) throws SQLException {
		QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "insert into t_rest(id,r_rest,r_account)values(?,?,?)";
		int i = runner.update(sql, new Object[] { UUIDUtil.getUUID(), rest, account });
		return i;
	}

	public int findSub(String account) throws SQLException {
		QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "select count(*) from t_rest where r_account = ?";
		Map<String, Object> res = runner.query(sql, new MapHandler(), new Object[] { account });
		return Integer.parseInt(res.get("count(*)").toString());
	}

	public void updateSub(String clazz) throws SQLException {
		QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "update t_clazz set c_end = ?,c_rest = c_rest - 1 where id = ?";
		runner.update(sql, new Object[] { DateUtil.dateToString(new Date()), clazz });
	}
}