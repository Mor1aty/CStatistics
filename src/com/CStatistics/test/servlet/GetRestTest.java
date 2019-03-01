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
 * @date 2019年2月9日下午9:07:24
 * 
 * @Description TODO 安排空课接口 Servlet 测试
 */
public class GetRestTest {
	// post 测试
	@Test
	public void testPost() {
		String url = "http://localhost:8080/CStatistics/";
		ImitateLoginHttpUtil ilh = new ImitateLoginHttpUtil("2016188003", "123456", url, "getRest");
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("time", "2");
		params.put("clazz", "01");
		String res = ilh.doPost(params);
		System.out.println(res);
	}

	// post 测试
	@Test
	public void testGet() {
		String url = "http://localhost:8080/CStatistics/";
		ImitateLoginHttpUtil ilh = new ImitateLoginHttpUtil("2016188003", "123456", url, "getRest");
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("time", "2");
		params.put("clazz", "01");
		String res = ilh.doGet(params);
		System.out.println(res);
	}
}
