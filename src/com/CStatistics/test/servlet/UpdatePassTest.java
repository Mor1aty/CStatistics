package com.CStatistics.test.servlet;

import java.io.InputStream;

import org.junit.Test;

import com.CStatistics.utils.HttpUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2018年12月16日下午9:01:08
 * 
 * @Description TODO 修改密码接口servlet测试
 */
public class UpdatePassTest {
	// post 测试
	@Test
	public void testPost() {
		String url = "http://localhost:8080/CStatistics/updatePass";
		InputStream is = HttpUtil.sendPost(url, "{oldPass:'123456',newPass:'456789'}");
		String result = HttpUtil.getString(is);
		System.out.println(result);
	}

	// get 测试
	@Test
	public void testGet() {
		String url = "http://localhost:8080/CStatistics/updatePass";
		InputStream is = HttpUtil.sendGet(url, "oldPass=123456&newPass=4567489");
		String result = HttpUtil.getString(is);
		System.out.println(result);
	}
}
