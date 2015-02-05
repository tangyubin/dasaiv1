package com.dasai.service.impl;

import com.dasai.dao.AdminDao;
import com.dasai.dao.MarkDao;
import com.dasai.dao.MessageDao;
import com.dasai.dao.StudentDao;
import com.dasai.dao.TeacherDao;
import com.dasai.dao.TeamDao;
import com.dasai.dao.UserDao;
import com.dasai.dao.WorkDao;
import com.dasai.dao.WorkTypeDao;
import com.dasai.domain.Student;
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
	public int validLogin(String usernameOrEmail, String password) {
		if(userDao.findByUsernameAndPassword(usernameOrEmail, password).size() >= 1) {
			return this.validUsername(usernameOrEmail);
		}else if(userDao.findByEmailAndPassword(usernameOrEmail, password).size() >= 1) {
			return this.validEmail(usernameOrEmail);
		}else {
			return LOGIN_FAIL;
		}
	}

	@Override
	public int validUsername(String username) {
		if(studentDao.findByUsername(username).size() >= 1) {
			return USER_TYPE_STUDENT;
		}else if(teamDao.findByUsername(username).size() >= 1) {
			return USER_TYPE_TEAM;
		}else if(teacherDao.findByUsername(username).size() >= 1) {
			return USER_TYPE_TEACHER;
		}else if(adminDao.findByUsername(username).size() >= 1) {
			return USER_TYPE_ADMIN;
		}else {
			return NOT_FOUND;
		}
	}

	@Override
	public int validEmail(String email) {
		if(studentDao.findByEmail(email).size() >= 1) {
			return USER_TYPE_STUDENT;
		}else if(teamDao.findByEmail(email).size() >= 1) {
			return USER_TYPE_TEAM;
		}else if(teacherDao.findByEmail(email).size() >= 1) {
			return USER_TYPE_TEACHER;
		}else if(adminDao.findByEmail(email).size() >= 1) {
			return USER_TYPE_ADMIN;
		}else {
			return NOT_FOUND;
		}
	}

	@Override
	public int validRegist(UserBean user) {
		if(this.validUsername(user.getUsername()) != 0 
				|| this.validEmail(user.getEmail()) != 0) {
			return REGIST_FAIL;
		}else {
			if(user.getUserType() == UserBean.USER_TYPE_STUDENT) {
				Student student = new Student();
				student.setUsername(user.getUsername());
				student.setPassword(user.getPassword());
				student.setEmail(user.getEmail());
				student.setEmailCheckback(false);
				studentDao.save(student);
				return USER_TYPE_STUDENT;
			}else {
				Team team = new Team();
				team.setUsername(user.getUsername());
				team.setPassword(user.getPassword());
				team.setEmail(user.getEmail());
				team.setEmailCheckback(false);
				teamDao.save(team);
				return USER_TYPE_TEAM;
			}
		}
	}
}
