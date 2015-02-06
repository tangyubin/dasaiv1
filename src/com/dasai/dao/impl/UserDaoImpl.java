package com.dasai.dao.impl;

import java.util.List;

import com.dasai.dao.UserDao;
import com.dasai.dao.base.TangYuBinHibernateDaoSupport;
import com.dasai.domain.User;

public class UserDaoImpl extends TangYuBinHibernateDaoSupport implements
		UserDao {
	
	@Override
	public User get(Integer id) {
		return (User)getHibernateTemplate()
				.get(User.class, id);
	}

	@Override
	public Integer save(User user) {
		return (Integer)getHibernateTemplate()
				.save(user);
	}

	@Override
	public void update(User user) {
		getHibernateTemplate().update(user);
	}

	@Override
	public void delete(User user) {
		getHibernateTemplate().delete(user);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<User> findAll() {
		return (List<User>)getHibernateTemplate().find("from User");
	}

	@Override
	public List<User> findByUsernameAndPassword(String username, String password) {
		return (List<User>)getHibernateTemplate()
				.find("from User where username = ? and password = ?", new String[] {username, password});
	}

	@Override
	public List<User> findByEmailAndPassword(String email, String password) {
		return (List<User>)getHibernateTemplate()
				.find("from User where email = ? and password = ?", new String[] {email, password});
	}

	@Override
	public List<User> findByUsername(String username) {
		return (List<User>)getHibernateTemplate()
				.find("from User where username = ?", new String[] {username});
	}

	@Override
	public List<User> findByEmail(String email) {
		return (List<User>)getHibernateTemplate()
				.find("from User where email = ?", new String[] {email});
	}

	@Override
	public List<User> findByUsernameOrEmail(String usernameOrEmail) {
		return (List<User>)getHibernateTemplate()
				.find("from User where username = ? or email = ?", new String[] {usernameOrEmail, usernameOrEmail});
	}
}
