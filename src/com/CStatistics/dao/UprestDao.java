package com.CStatistics.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
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
 * @date 2019年2月11日上午11:24:15
 * 
 * @Description TODO 提交查课记录接口Dao
 */
public class UprestDao {
	// 获取查课信息
	public int uprest(String time, String clazz, String minister, String member1, String member2, String result)
			throws SQLException {
		QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
		String sql = "insert into t_record(id,rd_time,rd_clazz,rd_minister,rd_member1,rd_member2,rd_result) values(?,?,?,?,?,?,?)";
		return runner.update(sql, new Object[] {UUIDUtil.getUUID(),time, clazz, minister, member1, member2, result });
	}
}
