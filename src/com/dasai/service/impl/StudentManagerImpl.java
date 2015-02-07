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
import com.dasai.domain.User;
import com.dasai.domain.Work;
import com.dasai.domain.WorkType;
import com.dasai.service.StudentManager;
import com.dasai.vo.StudentBean;
import com.dasai.vo.WorkBean;

public class StudentManagerImpl implements StudentManager {

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
	public StudentBean getStudentBean(String username) {
		Student student = (Student) studentDao.findByUsername(username);
		StudentBean studentBean = new StudentBean();
		studentBean.setName(student.getName());
		studentBean.setStudentId(student.getStudentId());
		studentBean.setTel(student.getTel());
		studentBean.setCollege(student.getCollege());
		studentBean.setGrade(student.getGrade());
		studentBean.setBankCardId(student.getBankCardId());
		studentBean.setOtherInfo(student.getOtherInfo());
		studentBean.setExperienceText(student.getExperienceText());
		return studentBean;
	}

	@Override
	public void saveStudentBean(String username, StudentBean studentBean) {
		Student student = (Student) studentDao.findByUsername(username);
		student.setName(studentBean.getName());
		student.setStudentId(studentBean.getStudentId());
		student.setTel(studentBean.getTel());
		student.setCollege(studentBean.getCollege());
		student.setGrade(studentBean.getGrade());
		student.setBankCardId(studentBean.getBankCardId());
		student.setOtherInfo(studentBean.getOtherInfo());
		student.setExperienceText(studentBean.getExperienceText());
		studentDao.update(student);
	}

	@Override
	public void addWork(WorkBean workBean) {
		Work work = new Work();
		String username = workBean.getOwner();
		User user = userDao.findByUsername(username).get(0);
		WorkType workType = workTypeDao.findByName(workBean.getWorkType()).get(0);
		work.setType(workType);
		work.setOwner(user);
		work.setCheckBack(false);
		work.setFilePath(workBean.getFilePath());
		work.setTitle(workBean.getTitle());
		workDao.save(work);
	}
}
