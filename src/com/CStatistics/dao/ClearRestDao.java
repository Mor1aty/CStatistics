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
 * @date 2019年2月11日下午1:30:39
 * 
 * @Description TODO 
 *清除空课信息Dao
 */
public class ClearRestDao {
     public int clear() throws SQLException{
    	 QueryRunner runner=new QueryRunner(JdbcUtil.getDataSource()) ;
    	 String sql="delete from t_rest";
    	 return runner.update(sql);
     }
}
