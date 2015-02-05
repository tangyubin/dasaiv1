package com.dasai.dao.impl;

import java.util.List;

import com.dasai.dao.WorkTypeDao;
import com.dasai.dao.base.TangYuBinHibernateDaoSupport;
import com.dasai.domain.WorkType;

public class WorkTypeDaoImpl extends TangYuBinHibernateDaoSupport implements
		WorkTypeDao {

	@Override
	public WorkType get(Integer id) {
		return (WorkType)getHibernateTemplate()
				.get(WorkType.class, id);
	}

	@Override
	public Integer save(WorkType workType) {
		return (Integer)getHibernateTemplate()
				.save(workType);
	}

	@Override
	public void update(WorkType workType) {
		getHibernateTemplate().update(workType);
	}

	@Override
	public void delete(WorkType workType) {
		getHibernateTemplate().delete(workType);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<WorkType> findAll() {
		return (List<WorkType>)getHibernateTemplate().find("from WorkType");
	}
}
