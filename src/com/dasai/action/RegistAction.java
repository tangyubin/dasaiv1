package com.dasai.action;

import java.util.HashMap;
import java.util.Map;

import com.dasai.action.base.UserBaseAction;
import com.dasai.service.UserManager;
import com.dasai.vo.UserBean;
import com.opensymphony.xwork2.ActionContext;

public class RegistAction extends UserBaseAction {
	private static final long serialVersionUID = 1L;
	private final Map<Integer, String> resultMap = new HashMap<Integer, String>() {
		{
			put(UserBean.USER_TYPE_ADMIN, "admin");
			put(UserBean.USER_TYPE_TEACHER, "teacher");
			put(UserBean.USER_TYPE_STUDENT, "student");
		}
	};
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
		if(userManager.validUsername(this.getUsername())) {
			dataMap.put("status", "20000");
		}else {
			dataMap.put("status", "10003");
		}
		return "success";
	}
	public String validEmail() {
		this.dataMap = new HashMap<String, Object>();
		if(userManager.validEmail(this.getEmail())) {
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
		UserBean userBean = new UserBean(username, password, email, userType);
		if(userManager.validRegist(userBean)) {
			ctx.getSession().put("username", userBean.getUsername());
			ctx.getSession().put("userType", userBean.getUserType());
			return resultMap.get(userBean.getUserType());
		}else {
			return REGIST_FAIL;
		}
	}
}
