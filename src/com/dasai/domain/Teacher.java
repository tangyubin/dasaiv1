package com.dasai.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 * Teacher，评委老师信息类。继承User类，以拥有基本用户信息
 * 
 * @author tangyubin(tang-yu-bin@qq.com)
 * @version 1.0
 * @date 2015/2/3
 */
public class Teacher extends User implements Serializable {

	/**
	 * 序列化该类对象时使用，SSH框架要求实现该接口
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 真实姓名
	 */
	private String name;
	/**
	 * 工作单位
	 */
	private String workUnit;
	/**
	 * 职位
	 */
	private String position;
	/**
	 * 工号
	 */
	private String jobId;
	/**
	 * 银行卡号
	 */
	private String bankCardId;
	/**
	 * 联系电话
	 */
	private String tel;
	/**
	 * 属于该老师的所有打分
	 */
	private Set<Mark> marks = new HashSet<Mark>();
	
	
	public Set<Mark> getMarks() {
		return marks;
	}
	public void setMarks(Set<Mark> marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWorkUnit() {
		return workUnit;
	}
	public void setWorkUnit(String workUnit) {
		this.workUnit = workUnit;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getBankCardId() {
		return bankCardId;
	}
	public void setBankCardId(String bankCardId) {
		this.bankCardId = bankCardId;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
