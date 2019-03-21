package com.CStatistics.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CStatistics.dao.GetClazzDao;
import com.CStatistics.pojo.Clazz;
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
 * @date 2019年2月12日上午10:38:56
 * 
 * @Description TODO 查看班级接口Sevlet
 */
@WebServlet("/getClazz")
public class GetClazzSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetClazzSevlet() {
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
		result = HttpUtil.checkParams(params, null);
		// 校验不通过，适用于需要请求参数的情况
		if (!"".equals(result.trim())) {
			response.getWriter().write(result);
			return;
		}
		try {
			GetClazzDao dao = new GetClazzDao();
			List<Clazz> clazz = dao.getClazz();
			if (clazz == null) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "查看失败");
			} else {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_SUCCESS, "查看成功");
			}
		} catch (Exception e) {
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		response.getWriter().write(result);
	}
}
