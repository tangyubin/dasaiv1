package com.dasai.dao.impl;

import java.util.List;

import com.dasai.dao.TeacherDao;
import com.dasai.dao.base.TangYuBinHibernateDaoSupport;
import com.dasai.domain.Teacher;
import com.dasai.domain.Teacher;
import com.dasai.domain.Teacher;

public class TeacherDaoImpl extends TangYuBinHibernateDaoSupport implements
		TeacherDao {
	
	@Override
	public Teacher get(Integer id) {
		return (Teacher)getHibernateTemplate()
				.get(Teacher.class, id);
	}

	@Override
	public Integer save(Teacher teacher) {
		return (Integer)getHibernateTemplate()
				.save(teacher);
	}

	@Override
	public void update(Teacher teacher) {
		getHibernateTemplate().update(teacher);
	}

	@Override
	public void delete(Teacher teacher) {
		getHibernateTemplate().delete(teacher);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<Teacher> findAll() {
		return (List<Teacher>)getHibernateTemplate().find("from Teacher");
	}

	@Override
	public List<Teacher> findByUsernameAndPassword(String username, String password) {
		return (List<Teacher>)getHibernateTemplate()
				.find("from Teacher where username = ? and password = ?", new String[] {username, password});
	}

	@Override
	public List<Teacher> findByEmailAndPassword(String email, String password) {
		return (List<Teacher>)getHibernateTemplate()
				.find("from Teacher where email = ? and password = ?", new String[] {email, password});
	}
	@Override
	public List<Teacher> findByUsername(String username) {
		return (List<Teacher>)getHibernateTemplate()
				.find("from Teacher where username = ?", new String[] {username});
	}

	@Override
	public List<Teacher> findByEmail(String email) {
		return (List<Teacher>)getHibernateTemplate()
				.find("from Teacher where email = ?", new String[] {email});
	}
}
