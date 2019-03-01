package com.CStatistics.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CStatistics.dao.UpUserDao;
import com.CStatistics.utils.AllConstant;
import com.CStatistics.utils.HttpUtil;
import com.CStatistics.utils.JsonUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年2月9日下午9:21:33
 * 
 * @Description TODO 导入用户信息接口 Servlet
 */
@WebServlet("/upUser")
public class UpUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpUserServlet() {
		super();
	}

	// 非接口入口
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().write(JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "请求异常！"));
	}

	// 接口入口
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 返回结果
		String result = "";
		// 解析请求参数
		HashMap<String, String> params = JsonUtil.getRequestParams(request);
		// 参数校验
		result = HttpUtil.checkParams(params, new String[] { "clazz", "account", "name", "identity", "gender" });
		// 校验不通过，适用于需要请求参数的情况
		if (!"".equals(result.trim())) {
			response.getWriter().write(result);
			return;
		}
		try {
			UpUserDao dao = new UpUserDao();
			String[] accounts = params.get("account").toString().split("_");
			String[] names = params.get("name").toString().split("_");
			String[] identitys = params.get("identity").toString().split("_");
			String[] genders = params.get("gender").toString().split("_");
			for (int i = 0; i < accounts.length; i++) {
				dao.upUser(params.get("clazz"), accounts[i], names[i], Integer.parseInt(identitys[i]),
						Integer.parseInt(genders[i]));
			}
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_SUCCESS, "上传成功");
		} catch (Exception e) {
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		response.getWriter().write(result);
	}

}
