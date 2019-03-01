package com.CStatistics.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CStatistics.dao.SubmitDao;
import com.CStatistics.pojo.User;
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
 * @date 2019年1月12日下午2:31:08
 * 
 * @Description TODO 提交空课接口
 *
 */
@WebServlet("/submit")
public class SubmitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SubmitServlet() {
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
		result = HttpUtil.checkParams(params, new String[] { "rest" });
		// 校验不通过，适用于需要请求参数的情况
		if (!"".equals(result.trim())) {
			response.getWriter().write(result);
			return;
		}
		try {
			SubmitDao dao = new SubmitDao();
			String account = request.getSession().getAttribute("user").toString();
			User user = dao.getUser(account);
			String clazz = "";
			if(user != null) {
				clazz = user.getU_clazz();
			}
			int j = dao.findSub(account);
			if(j != 0) {
				result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "用户空课已经存在");
			}else {
				int i = dao.subMit(params.get("rest"), account);
				if (i > 0) {
					if(!clazz.equals("")) {
						dao.updateSub(clazz);
					}
					result = JsonUtil.jsonResponse(null, AllConstant.CODE_SUCCESS, "提交空课成功");
				} else {
					result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "提交失败");
				}
			}
		} catch (Exception e) {
			result = JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, AllConstant.MSG_ERROR);
		}
		response.getWriter().write(result);
	}
}
