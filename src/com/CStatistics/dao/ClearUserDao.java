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
 * @date 2019年2月11日下午6:14:08
 * 
 * @Description TODO 
 *清除普通用户信息接口Dao
 */
public class ClearUserDao {
	public int getClear() throws SQLException{
      QueryRunner runner=new QueryRunner(JdbcUtil.getDataSource());
      String sql="delete from t_user";
      return runner.update(sql);
	}
}
