package com.dasai.dao;

import java.util.List;

import com.dasai.domain.Team;
import com.dasai.domain.Team;

public interface TeamDao {
	/**
	 * ���ݱ�ʶ����������Teamʵ����
	 * ���������ָ���ı�ʾ���ԣ��򣿣���
	 * @param id ��Ҫ���ص�Teamʵ���ı�ʶ����
	 * @return ָ����ʶ���Զ�Ӧ��Teamʵ��
	 */
	Team get(Integer id);
	/**
	 * �־û�ָ����Teamʵ������Teamʵ������Ҫ�б�ʶ����
	 * @param Team ��Ҫ���־û���Teamʵ��
	 * @return ʵ�����־û���ı�ʶ����
	 */
	Integer save(Team team);
	/**
	 * �޸�ָ����Employeeʵ����
	 * ��ʵ����Ҫָ����ʶ���ԣ�������
	 * @param Team ��Ҫ���޸ĵ�Teamʵ��
	 */
	void update(Team team);
	/**
	 * ɾ��ָ����Employeeʵ����
	 * ��ʵ����Ҫָ����ʶ���ԣ�����
	 * @param Team ��Ҫ��ɾ����Teamʵ��
	 */
	void delete(Team team);
	/**
	 * ���ݱ�ʶ����ɾ��Teamʵ��
	 * @param id ��Ҫ��ɾ����Teamʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);
	/**
	 * ��ѯȫ����Teamʵ��
	 * @return ���ݿ���ȫ����Teamʵ��
	 */
	List<Team> findAll();
	/**
	 * �����û����������ѯTeam,
	 * ���û��ƥ��ķ���null���ǿ�List����������
	 * @param username Team���û���
	 * @param password Team������
	 * @return �����û�����������û�����
	 */
	List<Team> findByUsernameAndPassword(String username, String password);
	/**
	 * ��������������ѯTeam
	 * @param email Team������
	 * @param password Team������
	 * @return ���������������û�����
	 */
	List<Team> findByEmailAndPassword(String email, String password);
	/**
	 * �����û�����ѯTeam
	 * @param username ��Ҫ��ѯ���û���
	 * @return �û���Ϊusername��Team����
	 */
	List<Team> findByUsername(String username);
	/**
	 * ���������ѯTeam
	 * @param email ��Ҫ��ѯ������
	 * @return ����Ϊemail��Team����
	 */
	List<Team> findByEmail(String email);
}
