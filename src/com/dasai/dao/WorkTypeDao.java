package com.dasai.dao;

import java.util.List;

import com.dasai.domain.WorkType;

public interface WorkTypeDao {
	/**
	 * 根据标识属性来加载WorkType实例
	 * 如果不存在指定的标识属性，则？？？
	 * @param id 需要加载的WorkType实例的标识属性
	 * @return 指定标识属性对应的WorkType实例
	 */
	WorkType get(Integer id);
	/**
	 * 持久化指定的WorkType实例，该WorkType实例不需要有标识属性？？？
	 * @param workType 需要被持久化的WorkType实例
	 * @return 实例被持久化后的标识属性
	 */
	Integer save(WorkType workType);
	/**
	 * 修改指定的WorkType实例，
	 * 该实例需要指定标识属性？？？
	 * @param workType 需要被修改的workType实例
	 */
	void update(WorkType workType);
	/**
	 * 删除指定的WorkType实例，
	 * 该实例需要指定标识属性？？？
	 * @param workType 需要被删除的WorkType实例
	 */
	void delete(WorkType workType);
	/**
	 * 根据标识属性删除WorkType实例
	 * @param id 需要被删除的WorkType实例的标识属性值
	 */
	void delete(Integer id);
	/**
	 * 查询全部的WorkType实例
	 * @return
	 */
	List<WorkType> findAll();
}
