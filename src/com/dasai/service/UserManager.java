package com.dasai.service;

import com.dasai.vo.UserBean;

public interface UserManager {
	/**
	 * 判断用户名是否可用
	 * @param username
	 * @return false:不可用;true:可用
	 */
	boolean validUsername(String username);
	/**
	 * 判断邮箱是否可用
	 * @param email
	 * @return false:不可用;true:可用
	 */
	boolean validEmail(String email);
	/**
	 * 根据登录信息，获取表示用户信息的UserBean
	 * @param usernameOrEmail
	 * @param password
	 * @return 如果登录成功，返回表示用户信息的UserBean，否则返回null
	 */
	UserBean getUserBean(String usernameOrEmail, String password);
	/**
	 * 判断是否注册成功
	 * @param userBean
	 * @return false:注册不成功;true:注册成功
	 */
	boolean validRegist(UserBean userBean);
}
