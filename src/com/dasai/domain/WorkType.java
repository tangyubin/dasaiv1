package com.dasai.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 * WorkType����Ʒ�����Ϣ�ࡣ
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
	 * ��ʶ����id
	 */
	private Integer id;
	/**
	 * ��Ʒ�������
	 */
	private String name;
	/**
	 * ����Ʒ���͵�������Ʒ
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
