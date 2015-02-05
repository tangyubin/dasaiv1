package com.dasai.dao.base;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.HibernateException;

import java.sql.SQLException;
import java.util.List;
public class TangYuBinHibernateDaoSupport
		extends HibernateDaoSupport{
	/**
	 * ʹ��hql�����з�ҳ��ѯ
	 * @param hql ��Ҫ��ѯ��hql���
	 * @param offset ��һ����¼����
	 * @param pageSize ÿҳ��Ҫ��ʾ�ļ�¼��
	 * @return ��ǰҳ�����м�¼
	 */
	public List findByPage(final String hql,
			final int offset, final int pageSize) {
		List list = getHibernateTemplate().executeFind(
				new HibernateCallback() {
					@Override
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List result = session.createQuery(hql)
							.setFirstResult(offset)
							.setMaxResults(pageSize)
							.list();
						return result;
					}
				}
		);
		return list;
	}
	/**
	 * ʹ��hql�����з�ҳ��ѯ
	 * @param hql ��Ҫ��ѯ��hql���
	 * @param value ���hql��һ��������Ҫ���룬 value���Ǵ���hql���Ĳ���
	 * @param offset ��һ����¼����
	 * @param pageSize ÿҳ��Ҫ��ʾ�ļ�¼��
	 * @return ��ǰҳ�����м�¼
	 */
	public List findByPage(final String hql, final Object value,
			final int offset, final int pageSize) {
		//ͨ��һ��HibernateCallback������ִ�в�ѯ
		List list = getHibernateTemplate()
				.executeFind(
						new HibernateCallback() {
							//ʵ��HibernateCallback�ӿڱ���ʵ�ֵķ���
							@Override
							public Object doInHibernate(Session session) throws HibernateException,
									SQLException {
								List result = session.createQuery(hql)
										.setParameter(0, value)
										.setFirstResult(offset)
										.setMaxResults(pageSize)
										.list();
								return result;
							}
						}
			
		);
		return list;
	}
	
	/**
	 * ʹ��hql�����з�ҳ��ѯ
	 * @param hql ��Ҫ��ѯ��hql���
	 * @param values ���hql�ж����������Ҫ���룬values���Ǵ���hql�Ĳ�������
	 * @param offset ��һ����¼����
	 * @param pageSize ÿҳ��Ҫ��ʾ�ļ�¼��
	 * @return ��ǰҳ�����м�¼
	 */
	public List findByPage(final String hql, final Object[] values,
		final int offset, final int pageSize)
	{
		//ͨ��һ��HibernateCallback������ִ�в�ѯ
		List list = getHibernateTemplate()
			.executeFind(new HibernateCallback()
		{
			//ʵ��HibernateCallback�ӿڱ���ʵ�ֵķ���
			public Object doInHibernate(Session session)
				throws HibernateException, SQLException
			{
				//ִ��Hibernate��ҳ��ѯ
				Query query = session.createQuery(hql);
				//Ϊhql��䴫�����
				for (int i = 0 ; i < values.length ; i++)
				{
					query.setParameter( i, values[i]);
				}
				List result = query.setFirstResult(offset)
					.setMaxResults(pageSize)
					.list();
				return result;
			}
		});
		return list;
	}
}