package com.dasai.dao;

import java.util.List;

import com.dasai.domain.Teacher;

public interface TeacherDao {
	/**
	 * ���ݱ�ʶ����������Teacherʵ����
	 * ���������ָ���ı�ʾ���ԣ��򷵻�null
	 * @param id ��Ҫ���ص�Teacherʵ���ı�ʶ����
	 * @return ָ����ʶ���Զ�Ӧ��Teacherʵ��
	 */
	Teacher get(Integer id);
	/**
	 * �־û�ָ����Teacherʵ������Teacherʵ������Ҫ�б�ʶ����
	 * @param Teacher ��Ҫ���־û���Teacherʵ��
	 * @return ʵ�����־û���ı�ʶ����
	 */
	Integer save(Teacher teacher);
	/**
	 * �޸�ָ����Employeeʵ����
	 * ��ʵ����Ҫָ����ʶ���ԣ�������׳�����ʱ�쳣��org.springframework.dao.InvalidDataAccessApiUsageException
	 * @param Teacher ��Ҫ���޸ĵ�Teacherʵ��
	 */
	void update(Teacher teacher);
	/**
	 * ɾ��ָ����Employeeʵ����
	 * ��ʵ����Ҫָ����ʶ���ԣ�����
	 * @param Teacher ��Ҫ��ɾ����Teacherʵ��
	 */
	void delete(Teacher teacher);
	/**
	 * ���ݱ�ʶ����ɾ��Teacherʵ��
	 * @param id ��Ҫ��ɾ����Teacherʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);
	/**
	 * ��ѯȫ����Teacherʵ��
	 * @return ���ݿ���ȫ����Teacherʵ��
	 */
	List<Teacher> findAll();
	/**
	 * �����û����������ѯTeacher,
	 * ���û��ƥ��ķ���null���ǿ�List����������
	 * @param username Teacher���û���
	 * @param password Teacher������
	 * @return �����û�����������û�����
	 */
	List<Teacher> findByUsernameAndPassword(String username, String password);
	/**
	 * ��������������ѯTeacher
	 * @param email Teacher������
	 * @param password Teacher������
	 * @return ���������������û�����
	 */
	List<Teacher> findByEmailAndPassword(String email, String password);
	/**
	 * �����û�����ѯTeacher
	 * @param username ��Ҫ��ѯ���û���
	 * @return �û���Ϊusername��Teacher����
	 */
	List<Teacher> findByUsername(String username);
	/**
	 * ���������ѯTeacher
	 * @param email ��Ҫ��ѯ������
	 * @return ����Ϊemail��Teacher����
	 */
	List<Teacher> findByEmail(String email);
}
