package com.CStatistics.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.CStatistics.pojo.RestBack;
import com.CStatistics.utils.JdbcUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年2月9日下午8:21:06
 * 
 * @Description TODO 
 *	安排空课接口Dao
 */
public class GetRestDao {
	// 获取所有不为某班级的次数小于3次的非管理员用户以及他的空课
	public List<RestBack> getUsers(String clazz) throws SQLException{
		QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "SELECT u_account,u_name,u_identity,u_gender,c_name,u_amount,r_rest FROM t_user LEFT JOIN t_rest ON u_account = r_account LEFT JOIN t_clazz ON u_clazz = t_clazz.id WHERE u_identity != 2 AND u_amount < 3 AND u_clazz != ?";
		return runner.query(sql, new BeanListHandler<RestBack>(RestBack.class), new Object[] {clazz});		 
	}
}
