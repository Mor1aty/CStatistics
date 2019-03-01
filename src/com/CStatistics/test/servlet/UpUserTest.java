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
 * @date 2019年2月9日下午9:28:07
 * 
 * @Description TODO 
 *	导入用户信息接口 Servlet 测试
 */
public class UpUserTest {
	// post 测试
	@Test
	public void testPost() {
		String url = "http://localhost:8080/CStatistics/";
		ImitateLoginHttpUtil ilh = new ImitateLoginHttpUtil("2016188003", "123456", url, "upUser");
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("clazz", "01");
		params.put("account", "2016188005_2016188006_2016188007_2016188008_2016188009");
		params.put("name", "吴一_吴二_吴三_吴四_吴五");
		params.put("identity", "0_1_0_1_0");
		params.put("gender", "0_1_0_1_0");
		String res = ilh.doPost(params);
		System.out.println(res);
	}

	// post 测试
	@Test
	public void testGet() {
		String url = "http://localhost:8080/CStatistics/";
		ImitateLoginHttpUtil ilh = new ImitateLoginHttpUtil("2016188003", "123456", url, "upUser");
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("time", "2");
		params.put("clazz", "01");
		String res = ilh.doGet(params);
		System.out.println(res);
	}
}
