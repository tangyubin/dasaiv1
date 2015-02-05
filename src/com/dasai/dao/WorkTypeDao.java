package com.dasai.dao;

import java.util.List;

import com.dasai.domain.WorkType;

public interface WorkTypeDao {
	/**
	 * ���ݱ�ʶ����������WorkTypeʵ��
	 * ���������ָ���ı�ʶ���ԣ��򣿣���
	 * @param id ��Ҫ���ص�WorkTypeʵ���ı�ʶ����
	 * @return ָ����ʶ���Զ�Ӧ��WorkTypeʵ��
	 */
	WorkType get(Integer id);
	/**
	 * �־û�ָ����WorkTypeʵ������WorkTypeʵ������Ҫ�б�ʶ���ԣ�����
	 * @param workType ��Ҫ���־û���WorkTypeʵ��
	 * @return ʵ�����־û���ı�ʶ����
	 */
	Integer save(WorkType workType);
	/**
	 * �޸�ָ����WorkTypeʵ����
	 * ��ʵ����Ҫָ����ʶ���ԣ�����
	 * @param workType ��Ҫ���޸ĵ�workTypeʵ��
	 */
	void update(WorkType workType);
	/**
	 * ɾ��ָ����WorkTypeʵ����
	 * ��ʵ����Ҫָ����ʶ���ԣ�����
	 * @param workType ��Ҫ��ɾ����WorkTypeʵ��
	 */
	void delete(WorkType workType);
	/**
	 * ���ݱ�ʶ����ɾ��WorkTypeʵ��
	 * @param id ��Ҫ��ɾ����WorkTypeʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);
	/**
	 * ��ѯȫ����WorkTypeʵ��
	 * @return
	 */
	List<WorkType> findAll();
}
