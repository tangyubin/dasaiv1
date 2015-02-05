package com.dasai.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 * Teacher����ί��ʦ��Ϣ�ࡣ�̳�User�࣬��ӵ�л����û���Ϣ
 * 
 * @author tangyubin(tang-yu-bin@qq.com)
 * @version 1.0
 * @date 2015/2/3
 */
public class Teacher extends User implements Serializable {

	/**
	 * ���л��������ʱʹ�ã�SSH���Ҫ��ʵ�ָýӿ�
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ��ʵ����
	 */
	private String name;
	/**
	 * ������λ
	 */
	private String workUnit;
	/**
	 * ְλ
	 */
	private String position;
	/**
	 * ����
	 */
	private String jobId;
	/**
	 * ���п���
	 */
	private String bankCardId;
	/**
	 * ��ϵ�绰
	 */
	private String tel;
	/**
	 * ���ڸ���ʦ�����д��
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
