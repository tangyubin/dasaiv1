package com.dasai.dao.impl;

import java.util.List;

import com.dasai.dao.MarkDao;
import com.dasai.dao.base.TangYuBinHibernateDaoSupport;
import com.dasai.domain.Mark;

public class MarkDaoImpl extends TangYuBinHibernateDaoSupport implements
		MarkDao {

	@Override
	public Mark get(Integer id) {
		return (Mark)getHibernateTemplate()
				.get(Mark.class, id);
	}

	@Override
	public Integer save(Mark mark) {
		return (Integer)getHibernateTemplate()
				.save(mark);
	}

	@Override
	public void update(Mark mark) {
		getHibernateTemplate().update(mark);
	}

	@Override
	public void delete(Mark mark) {
		getHibernateTemplate().delete(mark);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<Mark> findAll() {
		return (List<Mark>)getHibernateTemplate().find("from Mark");
	}
}
