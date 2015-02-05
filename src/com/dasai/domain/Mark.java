package com.dasai.domain;

import java.io.Serializable;
/**
 * Mark����ʦ������Ϣ�ࡣ����ĳ����ʦ����ĳ����Ʒ����Ϣ
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
	 * ��ʶ����id
	 */
	private Integer id;
	/**
	 * ����
	 */
	private String comment;
	/**
	 * ���
	 */
	private Double score;
	/**
	 * �ô�ֶ�Ӧ����Ʒ
	 */
	private Work work;
	/**
	 * �ô������Ӧ����ʦ
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
