package com.CStatistics.test.dao;

import java.sql.SQLException;

import org.junit.Test;

import com.CStatistics.dao.UprestDao;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年2月11日下午12:47:43
 * 
 * @Description TODO 
 * 提交查课信息Dao接口测试
 */
public class UprestTest {
	@Test
   public void getUprest() throws SQLException{
	   UprestDao dao=new UprestDao();
	   int m=dao.uprest("2019-2-2","01", "2017151016", "2017151016", "2017151016", "阿达");
       System.out.println(m);
   }
}
