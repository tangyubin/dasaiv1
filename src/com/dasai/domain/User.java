package com.dasai.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 * User，基本用户信息类，包含了student,teacher等不同类型用户所共有的信息。<br/>
 * 将会被Student,Teacher等类继承。
 * @author tangyubin(tang-yu-bin@qq.com)
 * @version 1.0
 * @date 2015/2/3
 */
public class User implements Serializable{

	/**
	 * 序列化该类对象时使用，SSH框架要求实现该接口
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 标识属性id
	 */
	private Integer id;
	/**
	 * 用户名，唯一
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 邮箱，唯一
	 */
	private String email;
	/**
	 * 邮箱是否被验证。true:已经过验证;false:还没有经过验证
	 */
	private Boolean emailCheckback;
	/**
	 * 收到的邮件
	 */
	private Set<Message> receivedMessage = new HashSet<Message>();
	/**
	 * 已经发送的邮件
	 */
	private Set<Message> sentMessage = new HashSet<Message>();
	
	/**
	 * 该用户提交的所有作品
	 */
	private Set<Work> works = new HashSet<Work>();
	
	
	public Set<Work> getWorks() {
		return works;
	}
	public void setWorks(Set<Work> works) {
		this.works = works;
	}
	public Set<Message> getReceivedMessage() {
		return receivedMessage;
	}
	public void setReceivedMessage(Set<Message> receivedMessage) {
		this.receivedMessage = receivedMessage;
	}
	public Set<Message> getSentMessage() {
		return sentMessage;
	}
	public void setSentMessage(Set<Message> sentMessage) {
		this.sentMessage = sentMessage;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getEmailCheckback() {
		return emailCheckback;
	}
	public void setEmailCheckback(Boolean emailCheckback) {
		this.emailCheckback = emailCheckback;
	}
}
