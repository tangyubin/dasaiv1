package com.dasai.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 * Work，作品信息类。
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
	 * 标识属性id
	 */
	private Integer id;
	/**
	 * 作品名称
	 */
	private String title;
	/**
	 * 作者姓名
	 */
	private String authorName;
	/**
	 * 作品电子版文件存储路径
	 */
	private String filePath;
	/**
	 * 是否被管理员审核通过:true:审核通过;false:未通过审核
	 */
	private Boolean checkBack;
	/**
	 * 作品所属的类别
	 */
	private WorkType type;
	/**
	 * 提交该作品的用户
	 */
	private User owner;
	/**
	 * 该作品对应的所有打分
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
