package com.dasai.dao.impl;

import java.util.List;

import com.dasai.dao.WorkDao;
import com.dasai.dao.base.TangYuBinHibernateDaoSupport;
import com.dasai.domain.Work;

public class WorkDaoImpl extends TangYuBinHibernateDaoSupport implements
		WorkDao {

	@Override
	public Work get(Integer id) {
		return (Work)getHibernateTemplate()
				.get(Work.class, id);
	}

	@Override
	public Integer save(Work work) {
		return (Integer)getHibernateTemplate()
				.save(work);
	}

	@Override
	public void update(Work work) {
		getHibernateTemplate().update(work);
	}

	@Override
	public void delete(Work work) {
		getHibernateTemplate().delete(work);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<Work> findAll() {
		return (List<Work>)getHibernateTemplate().find("from Work");
	}
}
