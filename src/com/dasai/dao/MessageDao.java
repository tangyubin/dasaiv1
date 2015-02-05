package com.dasai.dao;

import java.util.List;

import com.dasai.domain.Message;

public interface MessageDao {
	/**
	 * ���ݱ�ʶ����������Messageʵ��
	 * ���������ָ���ı�ʶ���ԣ��򣿣���
	 * @param id ��Ҫ���ص�Messageʵ���ı�ʶ����
	 * @return ָ����ʶ���Զ�Ӧ��Messageʵ��
	 */
	Message get(Integer id);
	/**
	 * �־û�ָ����Messageʵ������Messageʵ������Ҫ�б�ʶ���ԣ�����
	 * @param message ��Ҫ���־û���Messageʵ��
	 * @return ʵ�����־û���ı�ʶ����
	 */
	Integer save(Message message);
	/**
	 * �޸�ָ����Messageʵ����
	 * ��ʵ����Ҫָ����ʶ���ԣ�����
	 * @param message ��Ҫ���޸ĵ�messageʵ��
	 */
	void update(Message message);
	/**
	 * ɾ��ָ����Messageʵ����
	 * ��ʵ����Ҫָ����ʶ���ԣ�����
	 * @param message ��Ҫ��ɾ����Messageʵ��
	 */
	void delete(Message message);
	/**
	 * ���ݱ�ʶ����ɾ��Messageʵ��
	 * @param id ��Ҫ��ɾ����Messageʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);
	/**
	 * ��ѯȫ����Messageʵ��
	 * @return
	 */
	List<Message> findAll();
}
