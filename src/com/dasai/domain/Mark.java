package com.dasai.domain;

import java.io.Serializable;
/**
 * Mark，老师评分信息类。包含某个老师批阅某个作品的信息
 * 
 * @author tangyubin(tang-yu-bin@qq.com)
 * @version 1.0
 * @date 2015/2/3
 */
public class Mark implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 标识属性id
	 */
	private Integer id;
	/**
	 * 评语
	 */
	private String comment;
	/**
	 * 打分
	 */
	private Double score;
	/**
	 * 该打分对应的作品
	 */
	private Work work;
	/**
	 * 该打分所对应的老师
	 */
	private Teacher teacher;
	
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Work getWork() {
		return work;
	}
	public void setWork(Work work) {
		this.work = work;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
}
