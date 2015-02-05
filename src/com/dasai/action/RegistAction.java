package com.dasai.action;

import java.util.HashMap;
import java.util.Map;
import com.dasai.action.base.UserBaseAction;
import com.dasai.service.UserManager;
import com.dasai.vo.UserBean;
import com.opensymphony.xwork2.ActionContext;

public class RegistAction extends UserBaseAction {
	private static final long serialVersionUID = 1L;
	private final String STUDENT_REGIST_RESULT = "student";
	private final String TEAM_REGIST_RESULT = "team";
	private final String TEACHER_REGIST_RESULT = "teacher";
	private final String ADMIN_REGIST_RESULT = "admin";
	private final String REGIST_FAIL = "fail";
	private String username;
	private String password;
	private String email;
	private String userType;
	private Map<String, Object> dataMap;
	
	
	public Map<String, Object> getDataMap() {
		return dataMap;
	}
	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String validUsername() {
		this.dataMap = new HashMap<String, Object>();
		if(userManager.validUsername(this.getUsername()) == UserManager.NOT_FOUND) {
			dataMap.put("status", "20000");
		}else {
			dataMap.put("status", "10003");
		}
		return "success";
	}
	public String validEmail() {
		this.dataMap = new HashMap<String, Object>();
		if(userManager.validEmail(this.getEmail()) == UserManager.NOT_FOUND) {
			dataMap.put("status", "20000");
		}else {
			dataMap.put("status", "10003");
		}
		return "success";
	}
	public String execute() throws Exception{
		if(this.username == null) {
			return "input";
		}
		System.out.println("hello");
		ActionContext ctx = ActionContext.getContext();
		UserBean user = new UserBean(username, password, email, userType);
		int result = userManager.validRegist(user);
		if(result == userManager.USER_TYPE_STUDENT) {
			ctx.getSession().put(WebConstant.USERNAME_OR_EMAIL, username);
			ctx.getSession().put(WebConstant.LEVEL, WebConstant.STUDENT_LEVEL);
			return STUDENT_REGIST_RESULT;
		}else if(result == userManager.USER_TYPE_TEAM) {
			ctx.getSession().put(WebConstant.USERNAME_OR_EMAIL, username);
			ctx.getSession().put(WebConstant.LEVEL, WebConstant.TEAM_LEVEL);
			return TEAM_REGIST_RESULT;
		}else if(result == userManager.USER_TYPE_TEACHER) {
			ctx.getSession().put(WebConstant.USERNAME_OR_EMAIL, username);
			ctx.getSession().put(WebConstant.LEVEL, WebConstant.TEACHER_LEVEL);
			return TEACHER_REGIST_RESULT;
		}else if(result == userManager.USER_TYPE_ADMIN) {
			ctx.getSession().put(WebConstant.USERNAME_OR_EMAIL, username);
			ctx.getSession().put(WebConstant.LEVEL, WebConstant.ADMIN_LEVEL);
			return ADMIN_REGIST_RESULT;
		}else {
			return REGIST_FAIL;
		}
	}
}
