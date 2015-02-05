package com.dasai.dao;

import java.util.List;

import com.dasai.domain.User;

public interface UserDao {
	/**
	 * ���ݱ�ʶ����������Userʵ����
	 * ���������ָ���ı�ʾ���ԣ��򷵻�null
	 * @param id ��Ҫ���ص�Userʵ���ı�ʶ����
	 * @return ָ����ʶ���Զ�Ӧ��Userʵ��
	 */
	User get(Integer id);
	/**
	 * �־û�ָ����Userʵ������Userʵ������Ҫ�б�ʶ����
	 * @param user ��Ҫ���־û���Userʵ��
	 * @return ʵ�����־û���ı�ʶ����
	 */
	Integer save(User user);
	/**
	 * �޸�ָ����Userʵ����
	 * ��ʵ����Ҫָ����ʶ���ԣ�������׳�����ʱ�쳣��org.springframework.dao.InvalidDataAccessApiUsageException
	 * @param user ��Ҫ���޸ĵ�Userʵ��
	 */
	void update(User user);
	/**
	 * ɾ��ָ����Employeeʵ����
	 * ��ʵ����Ҫָ����ʶ���ԣ��������ݿ��е����ݲ��ᱻɾ����Ҳ�������쳣�׳���
	 * @param user ��Ҫ��ɾ����Userʵ��
	 */
	void delete(User user);
	/**
	 * ���ݱ�ʶ����ɾ��Userʵ��
	 * @param id ��Ҫ��ɾ����Userʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);
	/**
	 * ��ѯȫ����Userʵ��
	 * @return ���ݿ���ȫ����Userʵ����������ݿ��е�����Ϊ�գ��򷵻�һ��sizeΪ0��List
	 */
	List<User> findAll();
	/**
	 * �����û����������ѯUser
	 * @param username User���û���
	 * @param password User������
	 * @return �����û�����������û�����,���û��ƥ��ķ��ؿ�List,������null
	 */
	List<User> findByUsernameAndPassword(String username, String password);
	/**
	 * ��������������ѯUser
	 * @param email User������
	 * @param password User������
	 * @return ���������������û�����
	 */
	List<User> findByEmailAndPassword(String email, String password);
	/**
	 * �����û�����ѯUser
	 * @param username ��Ҫ��ѯ���û���
	 * @return �û���Ϊusername��User����
	 */
	List<User> findByUsername(String username);
	/**
	 * ���������ѯUser
	 * @param email ��Ҫ��ѯ������
	 * @return ����Ϊemail��User����
	 */
	List<User> findByEmail(String email);
}
