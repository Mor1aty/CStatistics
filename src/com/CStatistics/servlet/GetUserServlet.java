package com.CStatistics.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CStatistics.dao.GetUserDao;
import com.CStatistics.pojo.User;
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
 * @date 2019年2月9日下午9:40:14
 * 
 * @Description TODO 查看用户接口 Servlet
 */
@WebServlet("/getUser")
public class GetUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetUserServlet() {
		super();
	}

	// 接口入口
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 返回结果
		String result = "";
		try {
			GetUserDao dao = new GetUserDao();
			List<User> list = dao.getAllUser();
			result = JsonUtil.jsonResponse(list, AllConstant.CODE_SUCCESS, "查找成功");
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
