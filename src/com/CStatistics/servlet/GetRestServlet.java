package com.CStatistics.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CStatistics.dao.GetRestDao;
import com.CStatistics.pojo.RestBack;
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
 * @date 2019年2月9日下午8:59:27
 * 
 * @Description TODO 安排空课接口
 */
@WebServlet("/getRest")
public class GetRestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetRestServlet() {
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
		result = HttpUtil.checkParams(params, new String[] { "time", "clazz" });
		// 校验不通过，适用于需要请求参数的情况
		if (!"".equals(result.trim())) {
			response.getWriter().write(result);
			return;
		}
		try {
			GetRestDao dao = new GetRestDao();
			List<RestBack> list = dao.getUsers(params.get("clazz"));
			List<RestBack> res = new ArrayList<RestBack>();
			for (RestBack rb : list) {
				String[] s = rb.getR_rest().split("_");
				int i = Integer.parseInt(params.get("time"));
				if (i <= s.length && s[i].equals("0")) {
					res.add(rb);
				}
			}
			result = JsonUtil.jsonResponse(res, AllConstant.CODE_SUCCESS, "查找成功");
		} catch (Exception e) {
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		response.getWriter().write(result);
	}

}
