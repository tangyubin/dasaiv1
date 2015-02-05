package com.dasai.domain;

import java.io.Serializable;
/**
 * Admin，管理员信息类。继承User类，以拥有基本用户信息
 * 
 * @author tangyubin(tang-yu-bin@qq.com)
 * @version 1.0
 * @date 2015/2/3
 */
public class Admin extends User implements Serializable {

	/**
	 * 序列化该类对象时使用，SSH框架要求实现该接口
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 真实姓名
	 */
	private String name;
	/**
	 * 学院
	 */
	private String college;
	/**
	 * 年级。年级有三种：本科生："1",硕士生:"2",博士生:"3";
	 */
	private String grade;
	/**
	 * 学号
	 */
	private String studentId;
	/**
	 * 联系电话
	 */
	private String tel;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
