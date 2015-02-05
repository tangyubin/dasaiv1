/**
 * 
 */
package com.dasai.action.base;

import com.dasai.service.UserManager;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author tyb
 *
 */
public class UserBaseAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected UserManager userManager;

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
}
