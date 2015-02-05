package com.dasai.dao;

import java.util.List;

import com.dasai.domain.Teacher;

public interface TeacherDao {
	/**
	 * 根据标识属性来加载Teacher实例，
	 * 如果不存在指定的表示属性，则返回null
	 * @param id 需要加载的Teacher实例的标识属性
	 * @return 指定标识属性对应的Teacher实例
	 */
	Teacher get(Integer id);
	/**
	 * 持久化指定的Teacher实例，该Teacher实例不需要有标识属性
	 * @param Teacher 需要被持久化的Teacher实例
	 * @return 实例被持久化后的标识属性
	 */
	Integer save(Teacher teacher);
	/**
	 * 修改指定的Employee实例，
	 * 该实例需要指定标识属性，否则会抛出运行时异常：org.springframework.dao.InvalidDataAccessApiUsageException
	 * @param Teacher 需要被修改的Teacher实例
	 */
	void update(Teacher teacher);
	/**
	 * 删除指定的Employee实例，
	 * 该实例需要指定标识属性？？？
	 * @param Teacher 需要被删除的Teacher实例
	 */
	void delete(Teacher teacher);
	/**
	 * 根据标识属性删除Teacher实例
	 * @param id 需要被删除的Teacher实例的标识属性值
	 */
	void delete(Integer id);
	/**
	 * 查询全部的Teacher实例
	 * @return 数据库中全部的Teacher实例
	 */
	List<Teacher> findAll();
	/**
	 * 根据用户名和密码查询Teacher,
	 * 如果没有匹配的返回null还是空List？？？？？
	 * @param username Teacher的用户名
	 * @param password Teacher的密码
	 * @return 符合用户名和密码的用户集合
	 */
	List<Teacher> findByUsernameAndPassword(String username, String password);
	/**
	 * 根据邮箱和密码查询Teacher
	 * @param email Teacher的邮箱
	 * @param password Teacher的密码
	 * @return 符合邮箱和密码的用户集合
	 */
	List<Teacher> findByEmailAndPassword(String email, String password);
	/**
	 * 根据用户名查询Teacher
	 * @param username 需要查询的用户名
	 * @return 用户名为username的Teacher集合
	 */
	List<Teacher> findByUsername(String username);
	/**
	 * 根据邮箱查询Teacher
	 * @param email 需要查询的邮箱
	 * @return 邮箱为email的Teacher集合
	 */
	List<Teacher> findByEmail(String email);
}
