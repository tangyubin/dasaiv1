package com.dasai.domain;

import java.io.Serializable;
/**
 * Message，站内消息信息类。
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
	 * 标识属性id
	 */
	private Integer id;
	/**
	 * 站内消息内容
	 */
	private String content;
	/**
	 * 短信息是否已读。true：已读；false：未读
	 */
	private Boolean isReaded;
	/**
	 * 发信息的用户
	 */
	private User from;
	/**
	 * 收信息的用户
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
