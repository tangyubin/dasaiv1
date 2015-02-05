package com.dasai.action;

import org.quartz.utils.weblogic.WeblogicConnectionProvider;

import com.dasai.action.base.UserBaseAction;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction extends UserBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String STUDENT_LOGIN_RESULT = "student";
	private final String TEAM_LOGIN_RESULT = "team";
	private final String TEACHER_LOGIN_RESULT = "teacher";
	private final String ADMIN_LOGIN_RESULT = "admin";
	private final String LOGIN_FAIL = "fail";
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
		int result = userManager.validLogin(usernameOrEmail, password);
		if(result == userManager.USER_TYPE_STUDENT) {
			ctx.getSession().put(WebConstant.USERNAME_OR_EMAIL, usernameOrEmail);
			ctx.getSession().put(WebConstant.LEVEL, WebConstant.STUDENT_LEVEL);
			return STUDENT_LOGIN_RESULT;
		}else if(result == userManager.USER_TYPE_TEAM) {
			ctx.getSession().put(WebConstant.USERNAME_OR_EMAIL, usernameOrEmail);
			ctx.getSession().put(WebConstant.LEVEL, WebConstant.TEAM_LEVEL);
			return TEAM_LOGIN_RESULT;
		}else if(result == userManager.USER_TYPE_TEACHER) {
			ctx.getSession().put(WebConstant.USERNAME_OR_EMAIL, usernameOrEmail);
			ctx.getSession().put(WebConstant.LEVEL, WebConstant.TEACHER_LEVEL);
			return TEACHER_LOGIN_RESULT;
		}else if(result == userManager.USER_TYPE_ADMIN) {
			ctx.getSession().put(WebConstant.USERNAME_OR_EMAIL, usernameOrEmail);
			ctx.getSession().put(WebConstant.LEVEL, WebConstant.ADMIN_LEVEL);
			return ADMIN_LOGIN_RESULT;
		}else {
			return LOGIN_FAIL;
		}
	}
}
