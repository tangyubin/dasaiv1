package com.dasai.dao;

import java.util.List;

import com.dasai.domain.Message;

public interface MessageDao {
	/**
	 * 根据标识属性来加载Message实例
	 * 如果不存在指定的标识属性，则？？？
	 * @param id 需要加载的Message实例的标识属性
	 * @return 指定标识属性对应的Message实例
	 */
	Message get(Integer id);
	/**
	 * 持久化指定的Message实例，该Message实例不需要有标识属性？？？
	 * @param message 需要被持久化的Message实例
	 * @return 实例被持久化后的标识属性
	 */
	Integer save(Message message);
	/**
	 * 修改指定的Message实例，
	 * 该实例需要指定标识属性？？？
	 * @param message 需要被修改的message实例
	 */
	void update(Message message);
	/**
	 * 删除指定的Message实例，
	 * 该实例需要指定标识属性？？？
	 * @param message 需要被删除的Message实例
	 */
	void delete(Message message);
	/**
	 * 根据标识属性删除Message实例
	 * @param id 需要被删除的Message实例的标识属性值
	 */
	void delete(Integer id);
	/**
	 * 查询全部的Message实例
	 * @return
	 */
	List<Message> findAll();
}
