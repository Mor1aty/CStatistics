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
 * @date 2019年2月12日上午10:56:10
 * 
 * @Description TODO 导入班级信息接口Dao
 */
public class UpClazzDao {
	public int upClazz(String name, String num) throws SQLException {
		QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "insert into t_clazz(c_name,c_num) values ? ";
		int t = runner.update(sql, new Object[] { name, num });
		return t;
	}
}
