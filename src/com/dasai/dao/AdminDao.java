package com.dasai.dao;

import java.util.List;

import com.dasai.domain.Admin;
import com.dasai.domain.User;

public interface AdminDao {
	/**
	 * 根据标识属性来加载Admin实例，
	 * 如果不存在指定的表示属性，则？？？
	 * @param id 需要加载的Admin实例的标识属性
	 * @return 指定标识属性对应的Admin实例
	 */
	Admin get(Integer id);
	/**
	 * 持久化指定的Admin实例，该Admin实例不需要有标识属性
	 * @param Admin 需要被持久化的Admin实例
	 * @return 实例被持久化后的标识属性
	 */
	Integer save(Admin admin);
	/**
	 * 修改指定的Employee实例，
	 * 该实例需要指定标识属性？？？？
	 * @param Admin 需要被修改的Admin实例
	 */
	void update(Admin admin);
	/**
	 * 删除指定的Employee实例，
	 * 该实例需要指定标识属性？？？
	 * @param Admin 需要被删除的Admin实例
	 */
	void delete(Admin admin);
	/**
	 * 根据标识属性删除Admin实例
	 * @param id 需要被删除的Admin实例的标识属性值
	 */
	void delete(Integer id);
	/**
	 * 查询全部的Admin实例
	 * @return 数据库中全部的Admin实例
	 */
	List<Admin> findAll();
	/**
	 * 根据用户名和密码查询Admin,
	 * 如果没有匹配的返回null还是空List？？？？？
	 * @param username Admin的用户名
	 * @param password Admin的密码
	 * @return 符合用户名和密码的用户集合
	 */
	List<Admin> findByUsernameAndPassword(String username, String password);
	/**
	 * 根据邮箱和密码查询Admin
	 * @param email Admin的邮箱
	 * @param password Admin的密码
	 * @return 符合邮箱和密码的用户集合
	 */
	List<Admin> findByEmailAndPassword(String email, String password);
	/**
	 * 根据用户名查询Admin
	 * @param username 需要查询的用户名
	 * @return 用户名为username的Admin集合
	 */
	List<Admin> findByUsername(String username);
	/**
	 * 根据邮箱查询Admin
	 * @param email 需要查询的邮箱
	 * @return 邮箱为email的Admin集合
	 */
	List<Admin> findByEmail(String email);
}
