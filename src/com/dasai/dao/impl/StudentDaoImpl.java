package com.dasai.dao.impl;

import java.util.List;

import com.dasai.dao.StudentDao;
import com.dasai.dao.base.TangYuBinHibernateDaoSupport;
import com.dasai.domain.Student;
import com.dasai.domain.Student;

public class StudentDaoImpl extends TangYuBinHibernateDaoSupport implements
		StudentDao {
	
	@Override
	public Student get(Integer id) {
		return (Student)getHibernateTemplate()
				.get(Student.class, id);
	}

	@Override
	public Integer save(Student student) {
		return (Integer)getHibernateTemplate()
				.save(student);
	}

	@Override
	public void update(Student student) {
		getHibernateTemplate().update(student);
	}

	@Override
	public void delete(Student student) {
		getHibernateTemplate().delete(student);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<Student> findAll() {
		return (List<Student>)getHibernateTemplate().find("from Student");
	}

	@Override
	public List<Student> findByUsernameAndPassword(String username, String password) {
		return (List<Student>)getHibernateTemplate()
				.find("from Student where username = ? and password = ?", new String[] {username, password});
	}

	@Override
	public List<Student> findByEmailAndPassword(String email, String password) {
		return (List<Student>)getHibernateTemplate()
				.find("from Student where email = ? and password = ?", new String[] {email, password});
	}
	@Override
	public List<Student> findByUsername(String username) {
		return (List<Student>)getHibernateTemplate()
				.find("from Student where username = ?", new String[] {username});
	}

	@Override
	public List<Student> findByEmail(String email) {
		return (List<Student>)getHibernateTemplate()
				.find("from Student where email = ?", new String[] {email});
	}
}
