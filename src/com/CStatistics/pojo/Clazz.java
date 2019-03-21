package com.CStatistics.pojo;
/**
 * 
 * @copyright ：神农大学生软件创新中心 版权所有 © 2018
 * 
 * @author 17计算机 杜嘉慧
 * 
 * @version 1.0
 * 
 * @date 2019年2月11日下午7:17:04
 * 
 * @Description TODO 
 *班级表pojo
 */
public class Clazz {
  private String id;
  private String c_name;
  private int c_num;
  private int c_rest;
  private String c_end;
@Override
public String toString() {
	return "Clazz [id=" + id + ", c_name=" + c_name + ", c_num=" + c_num + ", c_rest=" + c_rest + ", c_end=" + c_end
			+ "]";
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getC_name() {
	return c_name;
}
public void setC_name(String c_name) {
	this.c_name = c_name;
}
public int getC_num() {
	return c_num;
}
public void setC_num(int c_num) {
	this.c_num = c_num;
}
public int getC_rest() {
	return c_rest;
}
public void setC_rest(int c_rest) {
	this.c_rest = c_rest;
}
public String getC_end() {
	return c_end;
}
public void setC_end(String c_end) {
	this.c_end = c_end;
}
  
}
