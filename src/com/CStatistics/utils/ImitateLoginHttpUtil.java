package com.CStatistics.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2018年12月17日下午1:58:00
 * 
 * @Description TODO 用于需要先登录的接口测试
 */
public class ImitateLoginHttpUtil {
	private String account;
	private String password;
	private String url;
	private String method;

	public ImitateLoginHttpUtil(String account, String password, String url, String method) {
		this.account = account;
		this.password = password;
		this.url = url;
		this.method = method;
	}

	public String doPost(HashMap<String, String> params) {
		if (params == null) {
			params = new HashMap<String, String>();
		}
		try {
			HashMap<String, String> cookies = login();
			return Jsoup.connect(url + method).cookies(cookies).data(params).timeout(5000).ignoreContentType(true)
					.method(Method.POST).execute().body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String doGet(HashMap<String, String> params) {
		if (params == null) {
			params = new HashMap<String, String>();
		}
		try {
			HashMap<String, String> cookies = login();
			return Jsoup.connect(url + method).cookies(cookies).data(params).timeout(5000).ignoreContentType(true)
					.method(Method.GET).execute().body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private HashMap<String, String> login() {
		try {
			Map<String, String> datas = new HashMap<String, String>();
			datas.put("account", account);
			datas.put("password", password);
			Response rs = Jsoup.connect(url + "login").data(datas).method(Method.POST).timeout(50000)
					.ignoreContentType(true).execute();
			System.out.println(rs.body());
			return (HashMap<String, String>) rs.cookies();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
