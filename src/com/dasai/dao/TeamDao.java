package com.dasai.dao;

import java.util.List;

import com.dasai.domain.Team;
import com.dasai.domain.Team;

public interface TeamDao {
	/**
	 * 根据标识属性来加载Team实例，
	 * 如果不存在指定的表示属性，则？？？
	 * @param id 需要加载的Team实例的标识属性
	 * @return 指定标识属性对应的Team实例
	 */
	Team get(Integer id);
	/**
	 * 持久化指定的Team实例，该Team实例不需要有标识属性
	 * @param Team 需要被持久化的Team实例
	 * @return 实例被持久化后的标识属性
	 */
	Integer save(Team team);
	/**
	 * 修改指定的Employee实例，
	 * 该实例需要指定标识属性？？？？
	 * @param Team 需要被修改的Team实例
	 */
	void update(Team team);
	/**
	 * 删除指定的Employee实例，
	 * 该实例需要指定标识属性？？？
	 * @param Team 需要被删除的Team实例
	 */
	void delete(Team team);
	/**
	 * 根据标识属性删除Team实例
	 * @param id 需要被删除的Team实例的标识属性值
	 */
	void delete(Integer id);
	/**
	 * 查询全部的Team实例
	 * @return 数据库中全部的Team实例
	 */
	List<Team> findAll();
	/**
	 * 根据用户名和密码查询Team,
	 * 如果没有匹配的返回null还是空List？？？？？
	 * @param username Team的用户名
	 * @param password Team的密码
	 * @return 符合用户名和密码的用户集合
	 */
	List<Team> findByUsernameAndPassword(String username, String password);
	/**
	 * 根据邮箱和密码查询Team
	 * @param email Team的邮箱
	 * @param password Team的密码
	 * @return 符合邮箱和密码的用户集合
	 */
	List<Team> findByEmailAndPassword(String email, String password);
	/**
	 * 根据用户名查询Team
	 * @param username 需要查询的用户名
	 * @return 用户名为username的Team集合
	 */
	List<Team> findByUsername(String username);
	/**
	 * 根据邮箱查询Team
	 * @param email 需要查询的邮箱
	 * @return 邮箱为email的Team集合
	 */
	List<Team> findByEmail(String email);
}
