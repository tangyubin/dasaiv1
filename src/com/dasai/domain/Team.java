package com.dasai.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Team��Team��Ϣ�ࡣ�̳�User�࣬��ӵ�л����û���Ϣ
 * 
 * @author tangyubin(tang-yu-bin@qq.com)
 * @version 1.0
 * @date 2015/2/3
 */
public class Team extends User implements Serializable {

	/**
	 * ���л��������ʱʹ�ã�SSH���Ҫ��ʵ�ָýӿ�.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ����
	 */
	private String teamName;
	/**
	 * ��Ŀ��
	 */
	private String projectName;
	/**
	 * ��Ŀ����
	 */
	private String projectDesc;
	/**
	 * �Ƿ񱻹���Ա��֤ͨ����true:��֤ͨ��;false:û����֤ͨ��
	 */
	private String checkBack;
	/**
	 * ���Ŷӵ����г�Ա
	 */
	private Set<Student> members = new HashSet<Student>();
	
	
	public Set<Student> getMembers() {
		return members;
	}
	public void setMembers(Set<Student> members) {
		this.members = members;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	public String getCheckBack() {
		return checkBack;
	}
	public void setCheckBack(String checkBack) {
		this.checkBack = checkBack;
	}
}
