package com.CStatistics.dao;

import java.sql.SQLException;
import java.util.Date;

import org.apache.commons.dbutils.QueryRunner;

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
 * @date 2019年2月12日上午10:56:10
 * 
 * @Description TODO 导入班级信息接口Dao
 */
public class UpClazzDao {
	public int upClazz(String name, String num) throws SQLException {
		QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "insert into t_clazz(id,c_name,c_num,c_rest,c_end) values (?,?,?,?,?)";
		int t = runner.update(sql,
				new Object[] { UUIDUtil.getUUID(), name, num, num, DateUtil.dateToString(new Date()) });
		return t;
	}
}
