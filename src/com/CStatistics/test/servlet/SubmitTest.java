package com.CStatistics.test.servlet;

import java.io.InputStream;
import java.util.HashMap;

import org.junit.Test;

import com.CStatistics.utils.HttpUtil;
import com.CStatistics.utils.ImitateLoginHttpUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年1月15日下午1:28:50
 * 
 * @Description TODO 提交空课接口sevlet测试
 *
 */
public class SubmitTest {
	// post 测试
	@Test
	public void testPost() {
		String url = "http://localhost:8080/CStatistics/";
		ImitateLoginHttpUtil ilh = new ImitateLoginHttpUtil("2016188003", "123456", url, "submit");
		HashMap<String,String> params = new HashMap<String,String>();
		params.put("rest", "1_0_0_1");
		String res = ilh.doPost(params);
		System.out.println(res);
	}

	// get 测试
	@Test
	public void testGet() {
		String url = "http://localhost:8080/CStatistics/submit";
		InputStream is = HttpUtil.sendGet(url, "rest=0_1_0_1_0");
		String result = HttpUtil.getString(is);
		System.out.println(result);
	}
}
