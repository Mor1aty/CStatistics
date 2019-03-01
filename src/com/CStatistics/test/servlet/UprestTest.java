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
 * @date 2019年2月11日下午1:07:40
 * 
 * @Description TODO 提交查课信息接口sevlet测试
 */
public class UprestTest {
	// post 测试
	@Test
	public void testPost() {
		String url = "http://localhost:8080/CStatistics/";
		ImitateLoginHttpUtil ilh = new ImitateLoginHttpUtil("2016188003", "123456", url, "upRest");
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("time", "2019-2-1");
		params.put("clazz", "02");
		params.put("minister", "2016188001");
		params.put("member1", "2016188003");
		params.put("member2", "2016188004");
		params.put("result", "Servlet测试");
		String res = ilh.doPost(params);
		System.out.println(res);
	}

	// get 测试
	@Test
	public void testGet() {
		String url = "http://localhost:8080/CStatistics/";
		ImitateLoginHttpUtil ilh = new ImitateLoginHttpUtil("2016188003", "123456", url, "upRest");
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("time", "2019-2-1");
		params.put("clazz", "02");
		params.put("minister", "2016188001");
		params.put("member1", "2016188003");
		params.put("member2", "2016188004");
		params.put("result", "Servlet测试");
		String res = ilh.doGet(params);
		System.out.println(res);
	}
}
