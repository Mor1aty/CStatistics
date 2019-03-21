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
 * @date 2019年2月12日上午11:22:17
 * 
 * @Description TODO 导入班级信息接口Servlet
 */
public class UpClazzTest {
	// post 测试
	@Test
	public void testPost() {
		String url = "http://localhost:8080/CStatistics/upClazz ";
		InputStream is = HttpUtil.sendPost(url, "name=计算机一班&num=23");
		String result = HttpUtil.getString(is);
		System.out.println(result);
	}

	// get 测试
	@Test
	public void testGet() {
		String url = "http://localhost:8080/CStatistics/upClazz ";
		InputStream is = HttpUtil.sendPost(url, "name=计算机一班&num=21");
		String result = HttpUtil.getString(is);
		System.out.println(result);
	}
}
