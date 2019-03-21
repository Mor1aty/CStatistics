package com.CStatistics.test.servlet;

import org.junit.Test;

import com.CStatistics.utils.ImitateLoginHttpUtil;

public class ClearUserTest {
	// post 测试
				@Test
				public void testPost() {
					String url = "http://localhost:8080/CStatistics/";
					ImitateLoginHttpUtil ilh=new ImitateLoginHttpUtil("2017151016","123456", url, "clearUser");
					String res = ilh.doPost(null);
					System.out.println(res);
				}
				// get 测试
				@Test
				public void testGet() {
					String url = "http://localhost:8080/CStatistics/";
					ImitateLoginHttpUtil ilh=new ImitateLoginHttpUtil("2017151016","123456", url, "clearUser");
					String res = ilh.doPost(null);
					System.out.println(res);
				}
}
