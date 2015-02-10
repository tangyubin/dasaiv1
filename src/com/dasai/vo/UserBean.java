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
	public static final int USER_TYPE_STUDENT = 1;
	public static final int USER_TYPE_TEAM = 2;
	public static final int USER_TYPE_TEACHER = 3;
	public static final int USER_TYPE_ADMIN = 4;
	
	private String username;
	private String password;
	private String email;
	/**
	 * 用户类型
	 */
	private int userType;
	
	public UserBean() {
		
	}
	public UserBean(String username, String password, String email, String userType) {
		this.username = username;
		this.password = password;
		this.email = email;
		if(userType.equals("1")) {
			this.userType = USER_TYPE_STUDENT;
		}else {
			this.userType = USER_TYPE_TEAM;
		}
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
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public void setUserType(String userType) {
		if(userType.equals("1")) {
			this.userType = USER_TYPE_STUDENT;
		}else {
			this.userType = USER_TYPE_TEAM;
		}
	}
}
