package com.CStatistics.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.CStatistics.dao.UpdatePassDao;
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
 * @date 2018年12月16日下午8:28:55
 * 
 * @Description TODO 修改密码接口
 */
@WebServlet("/updatePass")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateServlet() {
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
		result = HttpUtil.checkParams(params, new String[] { "oldPass", "newPass" });
		// 校验不通过，适用于需要请求参数的情况
		if (!"".equals(result.trim())) {
			response.getWriter().write(result);
			return;
		}
		try {
			UpdatePassDao dao = new UpdatePassDao();
			HttpSession session = request.getSession(false);
			if (session == null) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "你没登陆");
			} else {
				String account=session.getAttribute("user").toString();
				int y=dao.updatePass(account, params.get("oldpass"), params.get("newpass"));
				if (y > 0) {
					result = JsonUtil.jsonResponse(null, AllConstant.CODE_SUCCESS, "修改密码成功");
				} else {
					result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "请先登录");

				}
			}
		} catch (Exception e) {
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		response.getWriter().write(result);
	}

}