package com.dasai.domain;

import java.io.Serializable;
/**
 * Student，参赛学生信息类。继承User类，以拥有基本用户信息
 * 
 * @author tangyubin(tang-yu-bin@qq.com)
 * @version 1.0
 * @date 2015/2/3
 */
public class Student extends User implements Serializable {

	/**
	 * 序列化该类对象时使用，SSH框架要求实现该接口
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 联系电话
	 */
	private String tel;
	/**
	 * 真实姓名
	 */
	private String name;
	/**
	 * 学院
	 */
	private String college;
	/**
	 * 年级
	 */
	private String grade;
	/**
	 * 学号
	 */
	private String studentId;
	/**
	 * 银行卡号
	 */
	private String bankCardId;
	/**
	 * 比赛心得
	 */
	private String experienceText;
	/**
	 * 其他信息，如队员信息
	 */
	private String otherInfo;
	/**
	 * 该学生所属的团队
	 */
	private Team team;
	
	
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
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
	public String getBankCardId() {
		return bankCardId;
	}
	public void setBankCardId(String bankCardId) {
		this.bankCardId = bankCardId;
	}
	public String getExperienceText() {
		return experienceText;
	}
	public void setExperienceText(String experienceText) {
		this.experienceText = experienceText;
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	
}
