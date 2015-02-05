package com.dasai.dao.impl;

import java.util.List;

import com.dasai.dao.MessageDao;
import com.dasai.dao.base.TangYuBinHibernateDaoSupport;
import com.dasai.domain.Message;

public class MessageDaoImpl extends TangYuBinHibernateDaoSupport implements
		MessageDao {

	@Override
	public Message get(Integer id) {
		return (Message)getHibernateTemplate()
				.get(Message.class, id);
	}

	@Override
	public Integer save(Message message) {
		return (Integer)getHibernateTemplate()
				.save(message);
	}

	@Override
	public void update(Message message) {
		getHibernateTemplate().update(message);
	}

	@Override
	public void delete(Message message) {
		getHibernateTemplate().delete(message);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<Message> findAll() {
		return (List<Message>)getHibernateTemplate().find("from Message");
	}
}
