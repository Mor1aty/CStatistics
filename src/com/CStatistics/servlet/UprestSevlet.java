package com.CStatistics.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CStatistics.dao.UprestDao;
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
 * @date 2019年2月11日上午11:51:30
 * 
 * @Description TODO 提交查课信息接口
 */
@WebServlet("/upRest")
public class UprestSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UprestSevlet() {
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
		result = HttpUtil.checkParams(params,
				new String[] { "time", "clazz", "minister", "member1", "member2", "result" });
		// 校验不通过，适用于需要请求参数的情况
		if (!"".equals(result.trim())) {
			response.getWriter().write(result);
			return;
		}
		try {
			UprestDao dao = new UprestDao();
			int i = dao.uprest(params.get("time"), params.get("clazz"), params.get("minister"), params.get("member1"),
					params.get("member2"), params.get("result"));
			if(i > 0) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_SUCCESS, "写入成功");
			}else {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "写入失败");
			}
		} catch (Exception e) {
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		response.getWriter().write(result);
	}

}