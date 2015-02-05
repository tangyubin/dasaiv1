package com.dasai.dao;

import java.util.List;

import com.dasai.domain.Admin;
import com.dasai.domain.User;

public interface AdminDao {
	/**
	 * ���ݱ�ʶ����������Adminʵ����
	 * ���������ָ���ı�ʾ���ԣ��򣿣���
	 * @param id ��Ҫ���ص�Adminʵ���ı�ʶ����
	 * @return ָ����ʶ���Զ�Ӧ��Adminʵ��
	 */
	Admin get(Integer id);
	/**
	 * �־û�ָ����Adminʵ������Adminʵ������Ҫ�б�ʶ����
	 * @param Admin ��Ҫ���־û���Adminʵ��
	 * @return ʵ�����־û���ı�ʶ����
	 */
	Integer save(Admin admin);
	/**
	 * �޸�ָ����Employeeʵ����
	 * ��ʵ����Ҫָ����ʶ���ԣ�������
	 * @param Admin ��Ҫ���޸ĵ�Adminʵ��
	 */
	void update(Admin admin);
	/**
	 * ɾ��ָ����Employeeʵ����
	 * ��ʵ����Ҫָ����ʶ���ԣ�����
	 * @param Admin ��Ҫ��ɾ����Adminʵ��
	 */
	void delete(Admin admin);
	/**
	 * ���ݱ�ʶ����ɾ��Adminʵ��
	 * @param id ��Ҫ��ɾ����Adminʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);
	/**
	 * ��ѯȫ����Adminʵ��
	 * @return ���ݿ���ȫ����Adminʵ��
	 */
	List<Admin> findAll();
	/**
	 * �����û����������ѯAdmin,
	 * ���û��ƥ��ķ���null���ǿ�List����������
	 * @param username Admin���û���
	 * @param password Admin������
	 * @return �����û�����������û�����
	 */
	List<Admin> findByUsernameAndPassword(String username, String password);
	/**
	 * ��������������ѯAdmin
	 * @param email Admin������
	 * @param password Admin������
	 * @return ���������������û�����
	 */
	List<Admin> findByEmailAndPassword(String email, String password);
	/**
	 * �����û�����ѯAdmin
	 * @param username ��Ҫ��ѯ���û���
	 * @return �û���Ϊusername��Admin����
	 */
	List<Admin> findByUsername(String username);
	/**
	 * ���������ѯAdmin
	 * @param email ��Ҫ��ѯ������
	 * @return ����Ϊemail��Admin����
	 */
	List<Admin> findByEmail(String email);
}
