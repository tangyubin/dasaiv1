package com.dasai.service;

import com.dasai.vo.StudentBean;
import com.dasai.vo.WorkBean;

public interface StudentManager {
	StudentBean getStudentBean(String username);
	void saveStudentBean(String username, StudentBean studentBean);
	void addWork(WorkBean workBean);
	boolean updateStudentInfo(StudentBean studentBean);
}
