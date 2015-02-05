package com.dasai.dao;

import java.util.List;

import com.dasai.domain.Student;

public interface StudentDao {
	/**
	 * ���ݱ�ʶ����������Studentʵ����
	 * ���������ָ���ı�ʾ���ԣ��򣿣���
	 * @param id ��Ҫ���ص�Studentʵ���ı�ʶ����
	 * @return ָ����ʶ���Զ�Ӧ��Studentʵ��
	 */
	Student get(Integer id);
	/**
	 * �־û�ָ����Studentʵ������Studentʵ������Ҫ�б�ʶ����
	 * @param Student ��Ҫ���־û���Studentʵ��
	 * @return ʵ�����־û���ı�ʶ����
	 */
	Integer save(Student student);
	/**
	 * �޸�ָ����Employeeʵ����
	 * ��ʵ����Ҫָ����ʶ���ԣ�������
	 * @param Student ��Ҫ���޸ĵ�Studentʵ��
	 */
	void update(Student student);
	/**
	 * ɾ��ָ����Employeeʵ����
	 * ��ʵ����Ҫָ����ʶ���ԣ�����
	 * @param Student ��Ҫ��ɾ����Studentʵ��
	 */
	void delete(Student student);
	/**
	 * ���ݱ�ʶ����ɾ��Studentʵ��
	 * @param id ��Ҫ��ɾ����Studentʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);
	/**
	 * ��ѯȫ����Studentʵ��
	 * @return ���ݿ���ȫ����Studentʵ��
	 */
	List<Student> findAll();
	/**
	 * �����û����������ѯStudent,
	 * ���û��ƥ��ķ���null���ǿ�List����������
	 * @param username Student���û���
	 * @param password Student������
	 * @return �����û�����������û�����
	 */
	List<Student> findByUsernameAndPassword(String username, String password);
	/**
	 * ��������������ѯStudent
	 * @param email Student������
	 * @param password Student������
	 * @return ���������������û�����
	 */
	List<Student> findByEmailAndPassword(String email, String password);
	/**
	 * �����û�����ѯStudent
	 * @param username ��Ҫ��ѯ���û���
	 * @return �û���Ϊusername��Student����
	 */
	List<Student> findByUsername(String username);
	/**
	 * ���������ѯStudent
	 * @param email ��Ҫ��ѯ������
	 * @return ����Ϊemail��Student����
	 */
	List<Student> findByEmail(String email);
}
