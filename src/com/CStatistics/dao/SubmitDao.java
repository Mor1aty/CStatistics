package com.CStatistics.dao;

import java.sql.SQLException;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;

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
 * @Description TODO  提交空课接口Dao
 *
 */
public class SubmitDao {
     public int subMit(String rest,String account)throws SQLException{
    	 QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
    	 String sql = "insert into t_rest(id,r_rest,r_account)values(?,?,?)";
    	 int i=runner.update(sql,new Object[]{UUIDUtil.getUUID(),rest,account});
    	 return i;
     }
     public int getUserCount() throws SQLException {
   	  QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
   	  String sql="SELECT COUNT(*) FROM t_user WHERE u_account='2017151016'";
   	  Map<String,Object> is=runner.query(sql, new MapHandler());
   	  return Integer.parseInt(is.get("COUNT(*)").toString());
     }
   	
	
}