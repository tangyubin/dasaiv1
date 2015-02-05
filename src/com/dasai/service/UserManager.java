package com.dasai.service;

import com.dasai.vo.UserBean;

public interface UserManager {
	public static final int LOGIN_FAIL = 0;
	public static final int REGIST_FAIL = 0;
	public static final int NOT_FOUND = 0;
	public static final int USER_TYPE_ADMIN = 1;
	public static final int USER_TYPE_STUDENT = 2;
	public static final int USER_TYPE_TEACHER = 3;
	public static final int USER_TYPE_TEAM = 4;
	/**
	 * 验证登录
	 * @param usernameOrEmail 用户名或者邮箱
	 * @param password 密码
	 * @return 登录后的身份确认：0为登录失败，1为登录Admin，2为登录Student，3为登录Teacher，4为登录Team
	 */
	int validLogin(String usernameOrEmail, String password);
	/**
	 * 验证用户名在数据库中是否存在，以及如果存在的话属于什么类型的用户
	 * @param username 需要进行验证的用户名
	 * @return 0：该用户名不存在；1：用户类型为管理员；2：用户类型为学生；3：用户类型为老师；4：用户类型为团队；
	 */
	int validUsername(String username);
	/**
	 * 验证邮箱在数据库中是否存在，以及如果存在的话属于什么类型的用户
	 * @param email 需要进行验证的邮箱
	 * @return 0：该邮箱不存在；1：用户类型为管理员；2：用户类型为学生；3：用户类型为老师；4：用户类型为团队；
	 */
	int validEmail(String email);
	/**
	 * 验证注册
	 * @param user 表示用户信息的VO类，里面存放的是用户注册信息
	 * @return 注册后的身份确认：0为登录失败，1为登录Admin，2为登录Student，3为登录Teacher，4为登录Team
	 */
	int validRegist(UserBean user);
}
