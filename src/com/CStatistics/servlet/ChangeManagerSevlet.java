package com.CStatistics.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CStatistics.dao.ChangeManagerDao;
import com.CStatistics.utils.AllConstant;
import com.CStatistics.utils.HttpUtil;
import com.CStatistics.utils.JsonUtil;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年2月11日下午4:54:50
 * 
 * @Description TODO 修改管理员信息接口Sevlet
 */
@WebServlet("/changeManager")
public class ChangeManagerSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ChangeManagerSevlet() {
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
		result = HttpUtil.checkParams(params, new String[] { "u_account", "u_name", "u_gender", "u_claz" });
		// 校验不通过，适用于需要请求参数的情况
		if (!"".equals(result.trim())) {
			response.getWriter().write(result);
			return;
		}
		try {
			ChangeManagerDao dao = new ChangeManagerDao();

			int y = dao.change(params.get("u_account"), Integer.parseInt(params.get("u_gender")), params.get("u_name"),
					params.get("u_claz"));
			if (y > 0) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_SUCCESS, "修改信息成功");
			} else {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "修改信息失败");
			}

		} catch (Exception e) {
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		response.getWriter().write(result);
	}

}
