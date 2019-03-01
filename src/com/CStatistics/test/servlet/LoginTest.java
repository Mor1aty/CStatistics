package com.CStatistics.test.servlet;

import java.io.InputStream;

import org.junit.Test;

import com.CStatistics.utils.HttpUtil;


/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2018年12月8日下午6:14:45
 * 
 * @Description TODO 
 *	登录接口Servlet测试
 */
public class LoginTest {
	// post 测试
	@Test
	public void testPost() {
		String url = "http://localhost:8080/CStatistics/login";
		InputStream is = HttpUtil.sendPost(url, "{account:'2016188085',"
				+ "password:'123'}");
		String result = HttpUtil.getString(is);
		System.out.println(result);
	}
	// get 测试
	@Test
	public void testGet() {
		String url = "http://localhost:8080/CStatistics/login";
		InputStream is = HttpUtil.sendGet(url, "account=2016188085");
		String result = HttpUtil.getString(is);
		System.out.println(result);
	}
}
