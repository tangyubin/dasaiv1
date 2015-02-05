package com.dasai.domain;

import java.io.Serializable;
/**
 * Message��վ����Ϣ��Ϣ�ࡣ
 * 
 * @author tangyubin(tang-yu-bin@qq.com)
 * @version 1.0
 * @date 2015/2/3
 */
public class Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ��ʶ����id
	 */
	private Integer id;
	/**
	 * վ����Ϣ����
	 */
	private String content;
	/**
	 * ����Ϣ�Ƿ��Ѷ���true���Ѷ���false��δ��
	 */
	private Boolean isReaded;
	/**
	 * ����Ϣ���û�
	 */
	private User from;
	/**
	 * ����Ϣ���û�
	 */
	private User to;
	
	
	
	public User getFrom() {
		return from;
	}
	public void setFrom(User from) {
		this.from = from;
	}
	public User getTo() {
		return to;
	}
	public void setTo(User to) {
		this.to = to;
	}
	public Boolean getIsReaded() {
		return isReaded;
	}
	public void setIsReaded(Boolean isReaded) {
		this.isReaded = isReaded;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
