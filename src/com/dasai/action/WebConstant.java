package com.dasai.action;
public interface WebConstant
{
	//HttpSession里代表管理员的level值
	String ADMIN_LEVEL = "admin";
	//HttpSession里代表评委老师的level值
	String TEACHER_LEVEL = "teacher";
	//HttpSession里代表团队的level值
	String TEAM_LEVEL = "team";
	//HttpSession里代表学生的level值
	String STUDENT_LEVEL = "student";
	//HttpSession里代表用户级别的属性名
	String LEVEL = "level";
	//HttpSession里代表用户名的属性名
	String USERNAME_OR_EMAIL = "user";
}