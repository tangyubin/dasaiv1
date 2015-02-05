package com.dasai.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 * User�������û���Ϣ�࣬������student,teacher�Ȳ�ͬ�����û������е���Ϣ��<br/>
 * ���ᱻStudent,Teacher����̳С�
 * @author tangyubin(tang-yu-bin@qq.com)
 * @version 1.0
 * @date 2015/2/3
 */
public class User implements Serializable{

	/**
	 * ���л��������ʱʹ�ã�SSH���Ҫ��ʵ�ָýӿ�
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ��ʶ����id
	 */
	private Integer id;
	/**
	 * �û�����Ψһ
	 */
	private String username;
	/**
	 * ����
	 */
	private String password;
	/**
	 * ���䣬Ψһ
	 */
	private String email;
	/**
	 * �����Ƿ���֤��true:�Ѿ�����֤;false:��û�о�����֤
	 */
	private Boolean emailCheckback;
	/**
	 * �յ����ʼ�
	 */
	private Set<Message> receivedMessage = new HashSet<Message>();
	/**
	 * �Ѿ����͵��ʼ�
	 */
	private Set<Message> sentMessage = new HashSet<Message>();
	
	/**
	 * ���û��ύ��������Ʒ
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
