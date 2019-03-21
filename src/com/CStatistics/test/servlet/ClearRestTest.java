package com.CStatistics.test.servlet;

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
 * @date 2019年2月11日下午3:59:23
 * 
 * @Description TODO 
 *清除空课信息接口servlet测试
 */
public class ClearRestTest {
	// post 测试
			@Test
			public void testPost() {
				String url = "http://localhost:8080/CStatistics/";
				ImitateLoginHttpUtil ilh=new ImitateLoginHttpUtil("2017151016","123456", url, "clearRest");
				String res = ilh.doPost(null);
				System.out.println(res);
			}
			// get 测试
			@Test
			public void testGet() {
				String url = "http://localhost:8080/CStatistics/";
				ImitateLoginHttpUtil ilh=new ImitateLoginHttpUtil("2017151016","123456", url, "clearRest");
				String res = ilh.doGet(null);
				System.out.println(res);
			}
}
