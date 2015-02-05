package com.dasai.dao;

import java.util.List;

import com.dasai.domain.Work;

public interface WorkDao {
	/**
	 * ���ݱ�ʶ����������Workʵ��
	 * ���������ָ���ı�ʶ���ԣ��򣿣���
	 * @param id ��Ҫ���ص�Workʵ���ı�ʶ����
	 * @return ָ����ʶ���Զ�Ӧ��Workʵ��
	 */
	Work get(Integer id);
	/**
	 * �־û�ָ����Workʵ������Workʵ������Ҫ�б�ʶ���ԣ�����
	 * @param work ��Ҫ���־û���Workʵ��
	 * @return ʵ�����־û���ı�ʶ����
	 */
	Integer save(Work work);
	/**
	 * �޸�ָ����Workʵ����
	 * ��ʵ����Ҫָ����ʶ���ԣ�����
	 * @param work ��Ҫ���޸ĵ�workʵ��
	 */
	void update(Work work);
	/**
	 * ɾ��ָ����Workʵ����
	 * ��ʵ����Ҫָ����ʶ���ԣ�����
	 * @param work ��Ҫ��ɾ����Workʵ��
	 */
	void delete(Work work);
	/**
	 * ���ݱ�ʶ����ɾ��Workʵ��
	 * @param id ��Ҫ��ɾ����Workʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);
	/**
	 * ��ѯȫ����Workʵ��
	 * @return
	 */
	List<Work> findAll();
}
