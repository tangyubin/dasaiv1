package com.dasai.dao.impl;

import java.util.List;

import com.dasai.dao.TeamDao;
import com.dasai.dao.base.TangYuBinHibernateDaoSupport;
import com.dasai.domain.Team;
import com.dasai.domain.Team;

public class TeamDaoImpl extends TangYuBinHibernateDaoSupport implements
		TeamDao {
	
	@Override
	public Team get(Integer id) {
		return (Team)getHibernateTemplate()
				.get(Team.class, id);
	}

	@Override
	public Integer save(Team team) {
		return (Integer)getHibernateTemplate()
				.save(team);
	}

	@Override
	public void update(Team team) {
		getHibernateTemplate().update(team);
	}

	@Override
	public void delete(Team team) {
		getHibernateTemplate().delete(team);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<Team> findAll() {
		return (List<Team>)getHibernateTemplate().find("from Team");
	}

	@Override
	public List<Team> findByUsernameAndPassword(String username, String password) {
		return (List<Team>)getHibernateTemplate()
				.find("from Team where username = ? and password = ?", new String[] {username, password});
	}

	@Override
	public List<Team> findByEmailAndPassword(String email, String password) {
		return (List<Team>)getHibernateTemplate()
				.find("from Team where email = ? and password = ?", new String[] {email, password});
	}
	@Override
	public List<Team> findByUsername(String username) {
		return (List<Team>)getHibernateTemplate()
				.find("from Team where username = ?", new String[] {username});
	}

	@Override
	public List<Team> findByEmail(String email) {
		return (List<Team>)getHibernateTemplate()
				.find("from Team where email = ?", new String[] {email});
	}
}
