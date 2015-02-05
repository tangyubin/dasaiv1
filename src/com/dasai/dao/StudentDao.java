package com.dasai.dao;

import java.util.List;

import com.dasai.domain.Student;

public interface StudentDao {
	/**
	 * 根据标识属性来加载Student实例，
	 * 如果不存在指定的表示属性，则？？？
	 * @param id 需要加载的Student实例的标识属性
	 * @return 指定标识属性对应的Student实例
	 */
	Student get(Integer id);
	/**
	 * 持久化指定的Student实例，该Student实例不需要有标识属性
	 * @param Student 需要被持久化的Student实例
	 * @return 实例被持久化后的标识属性
	 */
	Integer save(Student student);
	/**
	 * 修改指定的Employee实例，
	 * 该实例需要指定标识属性？？？？
	 * @param Student 需要被修改的Student实例
	 */
	void update(Student student);
	/**
	 * 删除指定的Employee实例，
	 * 该实例需要指定标识属性？？？
	 * @param Student 需要被删除的Student实例
	 */
	void delete(Student student);
	/**
	 * 根据标识属性删除Student实例
	 * @param id 需要被删除的Student实例的标识属性值
	 */
	void delete(Integer id);
	/**
	 * 查询全部的Student实例
	 * @return 数据库中全部的Student实例
	 */
	List<Student> findAll();
	/**
	 * 根据用户名和密码查询Student,
	 * 如果没有匹配的返回null还是空List？？？？？
	 * @param username Student的用户名
	 * @param password Student的密码
	 * @return 符合用户名和密码的用户集合
	 */
	List<Student> findByUsernameAndPassword(String username, String password);
	/**
	 * 根据邮箱和密码查询Student
	 * @param email Student的邮箱
	 * @param password Student的密码
	 * @return 符合邮箱和密码的用户集合
	 */
	List<Student> findByEmailAndPassword(String email, String password);
	/**
	 * 根据用户名查询Student
	 * @param username 需要查询的用户名
	 * @return 用户名为username的Student集合
	 */
	List<Student> findByUsername(String username);
	/**
	 * 根据邮箱查询Student
	 * @param email 需要查询的邮箱
	 * @return 邮箱为email的Student集合
	 */
	List<Student> findByEmail(String email);
}
