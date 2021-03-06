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
 * @date 2018年12月17日下午6:05:32
 * 
 * @Description TODO 登录接口Servlet测试
 */
public class LogoffTest {
	// post 测试
	@Test
	public void testPost() {
		String url = "http://localhost:8080/CStatistics/";
		ImitateLoginHttpUtil im = new ImitateLoginHttpUtil("2016188085", "123", url, "logoff");
		HashMap<String, String> params = new HashMap<String, String>();
		String result = im.doPost(params);
		System.out.println(result);
	}

	// get 测试
	@Test
	public void testGet() {
		String url = "http://localhost:8080/CStatistics/";
		ImitateLoginHttpUtil im = new ImitateLoginHttpUtil("2016188085", "123", url, "logoff");
		HashMap<String, String> params = new HashMap<String, String>();
		String result = im.doGet(params);
		System.out.println(result);
	}
}
