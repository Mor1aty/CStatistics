package com.CStatistics.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.CStatistics.pojo.Clazz;
import com.CStatistics.utils.JdbcUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年2月11日下午6:59:45
 * 
 * @Description TODO 查看班级接口Dao
 */
public class GetClazzDao {
	public List<Clazz> getClazz() throws SQLException {
		QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "select * from t_clazz ";
		List<Clazz> list = runner.query(sql, new BeanListHandler<Clazz>(Clazz.class));
		return list;
	}
}
