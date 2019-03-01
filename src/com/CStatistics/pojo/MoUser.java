package com.CStatistics.pojo;

/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2019
 * 
 * @author Moriaty Auto Generate Code
 * 
 * @version 1.0
 * 
 * @date 2019-02-14 14:28:12
 * 
 * @Description TODO MoUser
 */
public class MoUser {
	private String u_account;
	private String u_password;
	private String u_name;
	private int u_identity;
	private int u_gender;
	private String u_clazz;
	private int u_amount;

	@Override
	public String toString() {
 		return "User [u_account=" + u_account + ",u_password=" + u_password + ",u_name=" + u_name + ",u_identity=" + u_identity + ",u_gender=" + u_gender + ",u_clazz=" + u_clazz + ",u_amount=" + u_amount + "]";
	}

	public String getU_account() {
		return u_account;
	}

	public void setU_account(String u_account) {
		this.u_account = u_account;
	}

	public String getU_password() {
		return u_password;
	}

	public void setU_password(String u_password) {
		this.u_password = u_password;
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

	public String getU_clazz() {
		return u_clazz;
	}

	public void setU_clazz(String u_clazz) {
		this.u_clazz = u_clazz;
	}

	public int getU_amount() {
		return u_amount;
	}

	public void setU_amount(int u_amount) {
		this.u_amount = u_amount;
	}

}