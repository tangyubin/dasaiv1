package com.dasai.action;

import java.util.HashMap;
import java.util.Map;

import com.dasai.action.base.UserBaseAction;
import com.dasai.vo.UserBean;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction extends UserBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String LOGIN_FAIL = "fail";
	
	private final Map<Integer, String> resultMap = new HashMap<Integer, String>() {
		{
			put(UserBean.USER_TYPE_ADMIN, "admin");
			put(UserBean.USER_TYPE_TEACHER, "teacher");
			put(UserBean.USER_TYPE_STUDENT, "student");
		}
	};
	private String usernameOrEmail;
	private String password;
	public String getUsernameOrEmail() {
		return usernameOrEmail;
	}
	public void setUsernameOrEmail(String usernameOrEmail) {
		this.usernameOrEmail = usernameOrEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute() throws Exception{
		if(this.usernameOrEmail == null) {
			return "input";
		}
		ActionContext ctx = ActionContext.getContext();
		UserBean userBean = userManager.getUserBean(usernameOrEmail, password);
		if(userBean == null) {
			return LOGIN_FAIL;
		}else {
			ctx.getSession().put("username", userBean.getUsername());
			ctx.getSession().put("userType", userBean.getUserType());
			return resultMap.get(userBean.getUserType());
		}
	}
}
