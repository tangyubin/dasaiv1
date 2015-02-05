package com.dasai.dao;

import java.util.List;

import com.dasai.domain.Work;

public interface WorkDao {
	/**
	 * 根据标识属性来加载Work实例
	 * 如果不存在指定的标识属性，则？？？
	 * @param id 需要加载的Work实例的标识属性
	 * @return 指定标识属性对应的Work实例
	 */
	Work get(Integer id);
	/**
	 * 持久化指定的Work实例，该Work实例不需要有标识属性？？？
	 * @param work 需要被持久化的Work实例
	 * @return 实例被持久化后的标识属性
	 */
	Integer save(Work work);
	/**
	 * 修改指定的Work实例，
	 * 该实例需要指定标识属性？？？
	 * @param work 需要被修改的work实例
	 */
	void update(Work work);
	/**
	 * 删除指定的Work实例，
	 * 该实例需要指定标识属性？？？
	 * @param work 需要被删除的Work实例
	 */
	void delete(Work work);
	/**
	 * 根据标识属性删除Work实例
	 * @param id 需要被删除的Work实例的标识属性值
	 */
	void delete(Integer id);
	/**
	 * 查询全部的Work实例
	 * @return
	 */
	List<Work> findAll();
}
