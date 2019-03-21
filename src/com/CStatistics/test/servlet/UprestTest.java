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
		ImitateLoginHttpUtil ilh = new ImitateLoginHttpUtil("2017151016", "123456",url,"upRest");
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("time", "2019-2-22");
		params.put("clazz", "01");
		params.put("minister", "2017151016");
		params.put("member1", "2017151016");
		params.put("member2", "2017151016");
		params.put("result", "sd");
		String res = ilh.doPost(params);
		System.out.println(res);
	}

	// get 测试
	@Test
	public void testGet() {
		String url = "http://localhost:8080/CStatistics/";
		ImitateLoginHttpUtil ilh = new ImitateLoginHttpUtil("2017151016", "123456",url,"upRest");
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("time", "2019-2-22");
		params.put("clazz", "01");
		params.put("minister", "2017151016");
		params.put("member1", "2017151016");
		params.put("member2", "2017151016");
		params.put("result", "sd");
		String res = ilh.doGet(params);
		System.out.println(res);
	}
}
