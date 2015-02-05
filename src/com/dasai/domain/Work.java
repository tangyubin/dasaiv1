package com.dasai.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 * Work����Ʒ��Ϣ�ࡣ
 * 
 * @author tangyubin(tang-yu-bin@qq.com)
 * @version 1.0
 * @date 2015/2/3
 */
public class Work implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ��ʶ����id
	 */
	private Integer id;
	/**
	 * ��Ʒ����
	 */
	private String title;
	/**
	 * ��������
	 */
	private String authorName;
	/**
	 * ��Ʒ���Ӱ��ļ��洢·��
	 */
	private String filePath;
	/**
	 * �Ƿ񱻹���Ա���ͨ��:true:���ͨ��;false:δͨ�����
	 */
	private Boolean checkBack;
	/**
	 * ��Ʒ���������
	 */
	private WorkType type;
	/**
	 * �ύ����Ʒ���û�
	 */
	private User owner;
	/**
	 * ����Ʒ��Ӧ�����д��
	 */
	private Set<Mark> marks = new HashSet<Mark>();
	
	
	public Set<Mark> getMarks() {
		return marks;
	}
	public void setMarks(Set<Mark> marks) {
		this.marks = marks;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public WorkType getType() {
		return type;
	}
	public void setType(WorkType type) {
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public Boolean getCheckBack() {
		return checkBack;
	}
	public void setCheckBack(Boolean checkBack) {
		this.checkBack = checkBack;
	}
	
	
}
