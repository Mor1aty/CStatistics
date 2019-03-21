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
 * @date 2018年12月16日下午7:07:54
 * 
 * @Description TODO 修改密码接口Dao
 */
public class UpdatePassDao {
	public int updatePass(String s, String oldPass, String newPass) throws SQLException {
		QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "UPDATE t_user SET u_password = ? where u_account  = ? and u_password = ?";
        return runner.update(sql,new Object[]{newPass,s,oldPass});
        
	}

}
