package com.dasai.domain;

import java.io.Serializable;
/**
 * Student������ѧ����Ϣ�ࡣ�̳�User�࣬��ӵ�л����û���Ϣ
 * 
 * @author tangyubin(tang-yu-bin@qq.com)
 * @version 1.0
 * @date 2015/2/3
 */
public class Student extends User implements Serializable {

	/**
	 * ���л��������ʱʹ�ã�SSH���Ҫ��ʵ�ָýӿ�
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ��ϵ�绰
	 */
	private String tel;
	/**
	 * ��ʵ����
	 */
	private String name;
	/**
	 * ѧԺ
	 */
	private String college;
	/**
	 * �꼶
	 */
	private String grade;
	/**
	 * ѧ��
	 */
	private String studentId;
	/**
	 * ���п���
	 */
	private String bankCardId;
	/**
	 * �����ĵ�
	 */
	private String experienceText;
	/**
	 * ������Ϣ�����Ա��Ϣ
	 */
	private String otherInfo;
	/**
	 * ��ѧ���������Ŷ�
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
