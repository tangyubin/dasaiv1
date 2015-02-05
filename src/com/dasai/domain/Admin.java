package com.dasai.domain;

import java.io.Serializable;
/**
 * Admin������Ա��Ϣ�ࡣ�̳�User�࣬��ӵ�л����û���Ϣ
 * 
 * @author tangyubin(tang-yu-bin@qq.com)
 * @version 1.0
 * @date 2015/2/3
 */
public class Admin extends User implements Serializable {

	/**
	 * ���л��������ʱʹ�ã�SSH���Ҫ��ʵ�ָýӿ�
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ��ʵ����
	 */
	private String name;
	/**
	 * ѧԺ
	 */
	private String college;
	/**
	 * �꼶���꼶�����֣���������"1",˶ʿ��:"2",��ʿ��:"3";
	 */
	private String grade;
	/**
	 * ѧ��
	 */
	private String studentId;
	/**
	 * ��ϵ�绰
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
