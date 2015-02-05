package com.dasai.dao;

import java.util.List;

import com.dasai.domain.Mark;

public interface MarkDao {
	/**
	 * 根据标识属性来加载Mark实例
	 * 如果不存在指定的标识属性，则？？？
	 * @param id 需要加载的Mark实例的标识属性
	 * @return 指定标识属性对应的Mark实例
	 */
	Mark get(Integer id);
	/**
	 * 持久化指定的Mark实例，该Mark实例不需要有标识属性？？？
	 * @param mark 需要被持久化的Mark实例
	 * @return 实例被持久化后的标识属性
	 */
	Integer save(Mark mark);
	/**
	 * 修改指定的Mark实例，
	 * 该实例需要指定标识属性？？？
	 * @param mark 需要被修改的mark实例
	 */
	void update(Mark mark);
	/**
	 * 删除指定的Mark实例，
	 * 该实例需要指定标识属性？？？
	 * @param mark 需要被删除的Mark实例
	 */
	void delete(Mark mark);
	/**
	 * 根据标识属性删除Mark实例
	 * @param id 需要被删除的Mark实例的标识属性值
	 */
	void delete(Integer id);
	/**
	 * 查询全部的Mark实例
	 * @return
	 */
	List<Mark> findAll();
}
