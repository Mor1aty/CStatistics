package com.CStatistics.filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
 * @date 2019年2月9日上午10:54:51
 * 
 * @Description TODO 登录验证过滤器
 */
@WebFilter(dispatcherTypes = { DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE,
		DispatcherType.ERROR }, urlPatterns = { "/*" })
public class ValidateLoginFilter implements Filter {

	public ValidateLoginFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 转化ServletRequest为HttpRequest
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		if (req.getServletPath().equals("/login") && req.getMethod().equals("POST")) {
			chain.doFilter(req, resp);
			return;
		}
		if (req.getServletPath().equals("/") && req.getMethod().equals("GET")) {
			chain.doFilter(req, resp);
			return;
		}	
		if (req.getServletPath().equals("/login.html") && req.getMethod().equals("GET")) {
			chain.doFilter(req, resp);
			return;
		}
		if (req.getServletPath().contains("/js/") && req.getMethod().equals("GET")) {
			chain.doFilter(req, resp);
			return;
		}
		if (req.getServletPath().contains("/css/") && req.getMethod().equals("GET")) {
			chain.doFilter(req, resp);
			return;
		}
		if (req.getServletPath().contains("/img/") && req.getMethod().equals("GET")) {
			chain.doFilter(req, resp);
			return;
		}
		if (req.getServletPath().contains("/layui/") && req.getMethod().equals("GET")) {
			chain.doFilter(req, resp);
			return;
		}
		if (req.getServletPath().contains("/jquery/") && req.getMethod().equals("GET")) {
			chain.doFilter(req, resp);
			return;
		}
		if (req.getSession().getAttribute("user") == null) {
			resp.getWriter().write(JsonUtil.jsonResponse(null, AllConstant.CODE_ERROR, "请先登录"));
		} else {
			chain.doFilter(req, resp);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
