package com.CStatistics.pojo;
/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 16计算机弓耀
 * 
 * @version 1.0
 * 
 * @date 2019年2月9日下午8:46:18
 * 
 * @Description TODO 
 *	所有不为某班级的次数小于3次的非管理员用户以及他的空课
 */
public class RestBack {
	private String u_account;
	private String u_name;
	private int u_identity;
	private int u_gender;
	private String c_name;
	private int u_amount;
	private String r_rest;
	@Override
	public String toString() {
		return "RestBack [u_account=" + u_account + ", u_name=" + u_name + ", u_identity=" + u_identity + ", u_gender="
				+ u_gender + ", c_name=" + c_name + ", u_amount=" + u_amount + ", r_rest=" + r_rest + "]";
	}
	public String getU_account() {
		return u_account;
	}
	public void setU_account(String u_account) {
		this.u_account = u_account;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public int getU_identity() {
		return u_identity;
	}
	public void setU_identity(int u_identity) {
		this.u_identity = u_identity;
	}
	public int getU_gender() {
		return u_gender;
	}
	public void setU_gender(int u_gender) {
		this.u_gender = u_gender;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getU_amount() {
		return u_amount;
	}
	public void setU_amount(int u_amount) {
		this.u_amount = u_amount;
	}
	public String getR_rest() {
		return r_rest;
	}
	public void setR_rest(String r_rest) {
		this.r_rest = r_rest;
	}
	
}
