package com.dasai.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 * WorkType，作品类别信息类。
 * 
 * @author tangyubin(tang-yu-bin@qq.com)
 * @version 1.0
 * @date 2015/2/3
 */
public class WorkType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 标识属性id
	 */
	private Integer id;
	/**
	 * 作品类别名称
	 */
	private String name;
	/**
	 * 该作品类型的所有作品
	 */
	private Set<Work> works = new HashSet<Work>();
	
	
	public Set<Work> getWorks() {
		return works;
	}
	public void setWorks(Set<Work> works) {
		this.works = works;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
