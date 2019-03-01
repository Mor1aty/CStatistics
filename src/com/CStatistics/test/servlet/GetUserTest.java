package com.CStatistics.test.servlet;

import java.util.HashMap;

import org.junit.Test;

import com.CStatistics.utils.ImitateLoginHttpUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年2月9日下午9:43:47
 * 
 * @Description TODO 
 *	查看用户接口 Servlet 测试
 */
public class GetUserTest {
	// post 测试
	@Test
	public void testPost() {
		String url = "http://localhost:8080/CStatistics/";
		ImitateLoginHttpUtil ilh = new ImitateLoginHttpUtil("2016188003", "123456", url, "getUser");
		HashMap<String, String> params = new HashMap<String, String>();		
		String res = ilh.doPost(params);
		System.out.println(res);
	}

	// post 测试
	@Test
	public void testGet() {
		String url = "http://localhost:8080/CStatistics/";
		ImitateLoginHttpUtil ilh = new ImitateLoginHttpUtil("2016188003", "123456", url, "getUser");
		HashMap<String, String> params = new HashMap<String, String>();
		String res = ilh.doGet(params);
		System.out.println(res);
	}
}
