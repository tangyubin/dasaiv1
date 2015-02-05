package com.dasai.dao.impl;

import java.util.List;

import com.dasai.dao.AdminDao;
import com.dasai.dao.base.TangYuBinHibernateDaoSupport;
import com.dasai.domain.Admin;
import com.dasai.domain.User;

public class AdminDaoImpl extends TangYuBinHibernateDaoSupport implements
		AdminDao {
	
	@Override
	public Admin get(Integer id) {
		return (Admin)getHibernateTemplate()
				.get(Admin.class, id);
	}

	@Override
	public Integer save(Admin admin) {
		return (Integer)getHibernateTemplate()
				.save(admin);
	}

	@Override
	public void update(Admin admin) {
		getHibernateTemplate().update(admin);
	}

	@Override
	public void delete(Admin admin) {
		getHibernateTemplate().delete(admin);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<Admin> findAll() {
		return (List<Admin>)getHibernateTemplate().find("from Admin");
	}

	@Override
	public List<Admin> findByUsernameAndPassword(String username, String password) {
		return (List<Admin>)getHibernateTemplate()
				.find("from Admin where username = ? and password = ?", new String[] {username, password});
	}

	@Override
	public List<Admin> findByEmailAndPassword(String email, String password) {
		return (List<Admin>)getHibernateTemplate()
				.find("from Admin where email = ? and password = ?", new String[] {email, password});
	}

	@Override
	public List<Admin> findByUsername(String username) {
		return (List<Admin>)getHibernateTemplate()
				.find("from Admin where username = ?", new String[] {username});
	}

	@Override
	public List<Admin> findByEmail(String email) {
		return (List<Admin>)getHibernateTemplate()
				.find("from Admin where email = ?", new String[] {email});
	}
}
