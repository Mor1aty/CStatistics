package com.CStatistics.test.servlet;

import java.util.HashMap;

import org.junit.Test;

import com.CStatistics.utils.ImitateLoginHttpUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年2月11日下午5:12:26
 * 
 * @Description TODO 修改管理员信息接口Sevlet测试
 */
public class ChangeManagerTest {
	// post 测试
	@Test
	public void testPost() {
		String url = "http://localhost:8080/CStatistics/ ";
		ImitateLoginHttpUtil ilh = new ImitateLoginHttpUtil("2017151016", "123456", url, "changeManager");
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("u_account", "2017151012");
		params.put("u_name", "dj");
		params.put("u_gender", "1");
		params.put("u_claz",  "01");
		String res = ilh.doGet(params);
		System.out.println(res);
	}

	// get 测试
	@Test
	public void testGet() {
		String url = "http://localhost:8080/CStatistics/ ";
		ImitateLoginHttpUtil ilh = new ImitateLoginHttpUtil("2017151016", "123456", url, "changeManager");
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("u_account", "2017151012");
		params.put("u_name", "dj");
		params.put("u_gender", "1");
		params.put("u_claz",  "01");		
		String res = ilh.doGet(params);
		System.out.println(res);
	}
}
