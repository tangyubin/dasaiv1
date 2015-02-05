package com.dasai.dao;

import java.util.List;

import com.dasai.domain.Mark;

public interface MarkDao {
	/**
	 * ���ݱ�ʶ����������Markʵ��
	 * ���������ָ���ı�ʶ���ԣ��򣿣���
	 * @param id ��Ҫ���ص�Markʵ���ı�ʶ����
	 * @return ָ����ʶ���Զ�Ӧ��Markʵ��
	 */
	Mark get(Integer id);
	/**
	 * �־û�ָ����Markʵ������Markʵ������Ҫ�б�ʶ���ԣ�����
	 * @param mark ��Ҫ���־û���Markʵ��
	 * @return ʵ�����־û���ı�ʶ����
	 */
	Integer save(Mark mark);
	/**
	 * �޸�ָ����Markʵ����
	 * ��ʵ����Ҫָ����ʶ���ԣ�����
	 * @param mark ��Ҫ���޸ĵ�markʵ��
	 */
	void update(Mark mark);
	/**
	 * ɾ��ָ����Markʵ����
	 * ��ʵ����Ҫָ����ʶ���ԣ�����
	 * @param mark ��Ҫ��ɾ����Markʵ��
	 */
	void delete(Mark mark);
	/**
	 * ���ݱ�ʶ����ɾ��Markʵ��
	 * @param id ��Ҫ��ɾ����Markʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);
	/**
	 * ��ѯȫ����Markʵ��
	 * @return
	 */
	List<Mark> findAll();
}
