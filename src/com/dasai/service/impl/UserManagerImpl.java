package com.dasai.service.impl;

import java.util.List;

import com.dasai.dao.AdminDao;
import com.dasai.dao.MarkDao;
import com.dasai.dao.MessageDao;
import com.dasai.dao.StudentDao;
import com.dasai.dao.TeacherDao;
import com.dasai.dao.TeamDao;
import com.dasai.dao.UserDao;
import com.dasai.dao.WorkDao;
import com.dasai.dao.WorkTypeDao;
import com.dasai.domain.Admin;
import com.dasai.domain.Student;
import com.dasai.domain.Teacher;
import com.dasai.domain.Team;
import com.dasai.service.UserManager;
import com.dasai.vo.UserBean;

public class UserManagerImpl implements UserManager {
	
	private UserDao userDao;
	private StudentDao studentDao;
	private TeacherDao teacherDao;
	private AdminDao adminDao;
	private TeamDao teamDao;
	private MarkDao markDao;
	private MessageDao messageDao;
	private WorkDao workDao;
	private WorkTypeDao workTypeDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public TeamDao getTeamDao() {
		return teamDao;
	}

	public void setTeamDao(TeamDao teamDao) {
		this.teamDao = teamDao;
	}

	public MarkDao getMarkDao() {
		return markDao;
	}

	public void setMarkDao(MarkDao markDao) {
		this.markDao = markDao;
	}

	public MessageDao getMessageDao() {
		return messageDao;
	}

	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}

	public WorkDao getWorkDao() {
		return workDao;
	}

	public void setWorkDao(WorkDao workDao) {
		this.workDao = workDao;
	}

	public WorkTypeDao getWorkTypeDao() {
		return workTypeDao;
	}

	public void setWorkTypeDao(WorkTypeDao workTypeDao) {
		this.workTypeDao = workTypeDao;
	}

	@Override
	public boolean validUsername(String username) {
		return userDao.findByUsername(username).size() == 0;
	}

	@Override
	public boolean validEmail(String email) {
		return userDao.findByEmail(email).size() == 0;
	}

	@Override
	public UserBean getUserBean(String usernameOrEmail, String password) {
		UserBean userBean = getUserBeanByUsernameAndPassword(usernameOrEmail, password);
		if(userBean != null) {
			return userBean;
		}else {
			return getUserBeanByEmailAndPassword(usernameOrEmail, password);
		}
	}
	public UserBean getUserBeanByEmailAndPassword(String email, String password) {
		UserBean userBean = new UserBean();
		List list = studentDao.findByEmailAndPassword(email, password);
		if(list.size() >= 0) {
			Student student = (Student)list.get(0);
			userBean.setUsername(student.getUsername());
			userBean.setUserType(UserBean.USER_TYPE_STUDENT);
			return userBean;
		}
		list = teamDao.findByEmailAndPassword(email, password);
		if(list.size() >= 0) {
			Team team = (Team)list.get(0);
			userBean.setUsername(team.getUsername());
			userBean.setUserType(UserBean.USER_TYPE_TEAM);
			return userBean;
		}
		list = teacherDao.findByEmailAndPassword(email, password);
		if(list.size() >= 0) {
			Teacher teacher = (Teacher)list.get(0);
			userBean.setUsername(teacher.getUsername());
			userBean.setUserType(UserBean.USER_TYPE_TEACHER);
			return userBean;
		}
		list = adminDao.findByEmailAndPassword(email, password);
		if(list.size() >= 0) {
			Admin admin = (Admin)list.get(0);
			userBean.setUsername(admin.getUsername());
			userBean.setUserType(UserBean.USER_TYPE_ADMIN);
			return userBean;
		}
		return null;
	}
	public UserBean getUserBeanByUsernameAndPassword(String username, String password) {
		UserBean userBean = new UserBean();
		List list = studentDao.findByUsernameAndPassword(username, password);
		if(list.size() >= 0) {
			Student student = (Student)list.get(0);
			userBean.setUsername(student.getUsername());
			userBean.setUserType(UserBean.USER_TYPE_STUDENT);
			return userBean;
		}
		list = teamDao.findByUsernameAndPassword(username, password);
		if(list.size() >= 0) {
			Team team = (Team)list.get(0);
			userBean.setUsername(team.getUsername());
			userBean.setUserType(UserBean.USER_TYPE_TEAM);
			return userBean;
		}
		list = teacherDao.findByUsernameAndPassword(username, password);
		if(list.size() >= 0) {
			Teacher teacher = (Teacher)list.get(0);
			userBean.setUsername(teacher.getUsername());
			userBean.setUserType(UserBean.USER_TYPE_TEACHER);
			return userBean;
		}
		list = adminDao.findByUsernameAndPassword(username, password);
		if(list.size() >= 0) {
			Admin admin = (Admin)list.get(0);
			userBean.setUsername(admin.getUsername());
			userBean.setUserType(UserBean.USER_TYPE_ADMIN);
			return userBean;
		}
		return null;
	}
	@Override
	public boolean validRegist(UserBean userBean) {
		if(validUsername(userBean.getUsername()) && validEmail(userBean.getEmail())) {
			return true;
		}else {
			return false;
		}
	}
}
