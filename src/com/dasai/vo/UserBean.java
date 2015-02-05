/**
 * 
 */
package com.dasai.vo;

/**
 * @author tyb
 *
 */
public class UserBean {

	/**
	 * 0代表用户类型为学生；1代表用户类型为团队
	 */
	public static final int USER_TYPE_STUDENT = 0;
	public static final int USER_TYPE_TEAM = 1;
	private String username;
	private String password;
	private String email;
	/**
	 * 用户类型
	 */
	private String userType;
	
	/**
	 * 
	 */
	public UserBean() {
		
	}
	public UserBean(String username, String password, String email, String userType) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.userType = userType;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 得到用户类型，注意这里不是简单的getter函数，而是对将把表示用户类型的字符串转换成了整数，以便将来需求变化时好改代码
	 * @return 表示用户类型的整型常量
	 */
	public int getUserType() {
		if(this.userType.equals("学生")) {
			return USER_TYPE_STUDENT;
		}else {
			return USER_TYPE_TEAM;
		}
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
}
