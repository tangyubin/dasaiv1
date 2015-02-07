package com.dasai.action.authority;

import com.dasai.vo.UserBean;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TeamAuthorityInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Integer level = (Integer)ctx.getSession()
				.get("userType");
		if(level != null 
				&& (level.equals(UserBean.USER_TYPE_TEAM))) {
			return invocation.invoke();
		}else {
			return Action.LOGIN;
		}
	}

}
