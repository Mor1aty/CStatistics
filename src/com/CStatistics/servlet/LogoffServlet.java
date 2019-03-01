package com.CStatistics.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.CStatistics.utils.AllConstant;
import com.CStatistics.utils.JsonUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2018年12月17日下午5:56:39
 * 
 * @Description TODO 注销接口Servlet
 */
@WebServlet("/logoff")
public class LogoffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LogoffServlet() {
		super();
	}

	// 接口入口
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 返回结果
		String result = "";
		try {
			HttpSession session = request.getSession(false);
			session.removeAttribute("user");
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_SUCCESS, "注销成功");
		} catch (Exception e) {
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		response.getWriter().write(result);

	}

	// 非接口入口
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().write(JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "请求异常！"));
	}

}
