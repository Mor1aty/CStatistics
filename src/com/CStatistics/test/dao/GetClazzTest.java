package com.CStatistics.test.dao;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.CStatistics.dao.GetClazzDao;
import com.CStatistics.pojo.Clazz;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年2月12日上午10:32:22
 * 
 * @Description TODO 查看班级接口Dao测试
 */
public class GetClazzTest {
	@Test
	public void getClazz() throws SQLException {
		GetClazzDao dao = new GetClazzDao();
		List<Clazz> list = dao.getClazz();
		for(Clazz clazz : list){
			System.out.println(clazz);
		}
		
	}
}
