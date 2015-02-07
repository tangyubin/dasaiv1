package com.dasai.action.base;

import com.dasai.service.StudentManager;
import com.opensymphony.xwork2.ActionSupport;

public class StudentBaseAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected StudentManager studentManager;
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}
}
