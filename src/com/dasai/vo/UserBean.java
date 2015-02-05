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
	 * 0�����û�����Ϊѧ����1�����û�����Ϊ�Ŷ�
	 */
	public static final int USER_TYPE_STUDENT = 0;
	public static final int USER_TYPE_TEAM = 1;
	private String username;
	private String password;
	private String email;
	/**
	 * �û�����
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
	 * �õ��û����ͣ�ע�����ﲻ�Ǽ򵥵�getter���������ǶԽ��ѱ�ʾ�û����͵��ַ���ת�������������Ա㽫������仯ʱ�øĴ���
	 * @return ��ʾ�û����͵����ͳ���
	 */
	public int getUserType() {
		if(this.userType.equals("ѧ��")) {
			return USER_TYPE_STUDENT;
		}else {
			return USER_TYPE_TEAM;
		}
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
}
