package com.dasai.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Team，Team信息类。继承User类，以拥有基本用户信息
 * 
 * @author tangyubin(tang-yu-bin@qq.com)
 * @version 1.0
 * @date 2015/2/3
 */
public class Team extends User implements Serializable {

	/**
	 * 序列化该类对象时使用，SSH框架要求实现该接口.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 队名
	 */
	private String teamName;
	/**
	 * 项目名
	 */
	private String projectName;
	/**
	 * 项目描述
	 */
	private String projectDesc;
	/**
	 * 是否被管理员验证通过：true:验证通过;false:没有验证通过
	 */
	private String checkBack;
	/**
	 * 该团队的所有成员
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
