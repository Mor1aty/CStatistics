package com.CStatistics.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Set;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 (c) 2016
 * 
 * @author Mr. Soldier
 * 
 * @version 1.0
 * 
 * @date 2016年7月8日 下午5:17:58
 * 
 * @Description TODO 测试servlet类，模拟浏览器向自己写的servlet发送post和get请求，提交请求参数，方便测试。
 */

public class HttpUtil {

	/**
	 * 向指定URL发送GET方法的请求
	 * 
	 * @param url   发送请求的URL
	 * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
	 * @return URL 所代表远程资源的响应结果
	 */
	public static InputStream sendGet(String url, String param) {
		try {
			String urlNameString = url;
			String str = new String(param.getBytes(), "UTF-8");
			if (param != null) {
				urlNameString += "?" + str;
			}
			URL realUrl = new URL(urlNameString);
			// 打开和URL之间的连接
			URLConnection connection = realUrl.openConnection();
			// 设置通用的请求属性
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 建立实际的连接
			connection.connect();
			return connection.getInputStream();
		} catch (Exception e) {
			System.out.println("发送GET请求出现异常！" + e);
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 向指定 URL 发送POST方法的请求
	 * 
	 * @param url   发送请求的 URL
	 * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
	 * @return 所代表远程资源的响应结果
	 */
	public static InputStream sendPost(String url, String param) {
		PrintWriter out = null;
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			// 发送请求参数
			out.print(param);
			// flush输出流的缓冲
			out.flush();
			return conn.getInputStream();
		} catch (Exception e) {
			System.out.println("发送 POST 请求出现异常！" + e);
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
		}
		return null;
	}

	public static String getString(InputStream is) {
		if (is == null)
			return null;
		BufferedReader br = null;
		String result = "";
		try {
			br = new BufferedReader(new InputStreamReader(is, "utf-8"));
			String line = null;
			while ((line = br.readLine()) != null)
				result += line;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
					br = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	/**
	 * 校验封装的request的请求参数，若为null或者所要参数不存在则返回错误信息
	 * 
	 * @param map
	 * @param strings 要检验的参数数组
	 * @return
	 */
	public static String checkParams(HashMap<String, String> param, String[] strings) {
		String result = "";
		if (param == null) {
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "缺少请求参数");
		} else {
			Set<String> keySet = param.keySet();
			if (strings != null && strings.length > 0) {
				for (String string : strings) {
					// 校验参数是否存在
					boolean contains = keySet.contains(string);
					if (!contains) {
						result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "缺少" + string + "参数");
						return result;
					}
				}
			}
			for (String key : keySet) {
				// 通过传入的所要检验参数的值，比如要检验account和id字段，传入{"account"，"id"},检验该参数是否存在

				if (param.get(key) == null || "".equals(param.get(key))) {
					result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, key + "参数不能为空");
					return result;
				}
			}
		}
		return result;
	}
}
