package com.dasai.dao;

import java.util.List;

import com.dasai.domain.User;

public interface UserDao {
	/**
	 * 根据标识属性来加载User实例，
	 * 如果不存在指定的表示属性，则返回null
	 * @param id 需要加载的User实例的标识属性
	 * @return 指定标识属性对应的User实例
	 */
	User get(Integer id);
	/**
	 * 持久化指定的User实例，该User实例不需要有标识属性
	 * @param user 需要被持久化的User实例
	 * @return 实例被持久化后的标识属性
	 */
	Integer save(User user);
	/**
	 * 修改指定的User实例，
	 * 该实例需要指定标识属性，否则会抛出运行时异常：org.springframework.dao.InvalidDataAccessApiUsageException
	 * @param user 需要被修改的User实例
	 */
	void update(User user);
	/**
	 * 删除指定的Employee实例，
	 * 该实例需要指定标识属性，否则数据库中的数据不会被删除，也不会有异常抛出。
	 * @param user 需要被删除的User实例
	 */
	void delete(User user);
	/**
	 * 根据标识属性删除User实例
	 * @param id 需要被删除的User实例的标识属性值
	 */
	void delete(Integer id);
	/**
	 * 查询全部的User实例
	 * @return 数据库中全部的User实例，如果数据库中的数据为空，则返回一个size为0的List
	 */
	List<User> findAll();
	/**
	 * 根据用户名和密码查询User
	 * @param username User的用户名
	 * @param password User的密码
	 * @return 符合用户名和密码的用户集合,如果没有匹配的返回空List,不反回null
	 */
	List<User> findByUsernameAndPassword(String username, String password);
	/**
	 * 根据邮箱和密码查询User
	 * @param email User的邮箱
	 * @param password User的密码
	 * @return 符合邮箱和密码的用户集合
	 */
	List<User> findByEmailAndPassword(String email, String password);
	/**
	 * 根据用户名查询User
	 * @param username 需要查询的用户名
	 * @return 用户名为username的User集合
	 */
	List<User> findByUsername(String username);
	/**
	 * 根据邮箱查询User
	 * @param email 需要查询的邮箱
	 * @return 邮箱为email的User集合
	 */
	List<User> findByEmail(String email);
}
