package com.CStatistics.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author zmk
 * 
 * @version 1.0
 * 
 * @date 2018年12月27日下午4:55:28
 * 
 * @Description TODO 
 *	跨域过滤器
 */
@WebFilter("/*")
public class CrossDomainFilter implements Filter {

   
    public CrossDomainFilter() {

    }

	
	public void destroy() {

	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
		httpServletResponse.setHeader("Access-Control-Allow-Headers", "accept,content-type");
		httpServletResponse.setHeader("Access-Control-Allow-Methode", "OPTIONS,GET,POST,DELETE,PUT");
		httpServletResponse.setHeader("Access-Control-Allow-Headers", "x-requested-with");		
		chain.doFilter(httpServletRequest, httpServletResponse);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
	
	}

}
