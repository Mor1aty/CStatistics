package com.CStatistics.test.dao;

import java.sql.SQLException;

import org.junit.Test;

import com.CStatistics.dao.ClearRestDao;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年2月11日下午3:48:18
 * 
 * @Description TODO 
 * 清除空课Dao测试
 */
public class ClearRestDTest {
  @Test
  public void getClear() throws SQLException{
	  ClearRestDao dao =new ClearRestDao();
	  int m=dao.clear();
	  System.out.println(m);
  }
}
