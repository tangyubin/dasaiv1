package com.dasai.service;

import com.dasai.vo.UserBean;

public interface UserManager {
	/**
	 * �ж��û����Ƿ����
	 * @param username
	 * @return false:������;true:����
	 */
	boolean validUsername(String username);
	/**
	 * �ж������Ƿ����
	 * @param email
	 * @return false:������;true:����
	 */
	boolean validEmail(String email);
	/**
	 * ���ݵ�¼��Ϣ����ȡ��ʾ�û���Ϣ��UserBean
	 * @param usernameOrEmail
	 * @param password
	 * @return �����¼�ɹ������ر�ʾ�û���Ϣ��UserBean�����򷵻�null
	 */
	UserBean getUserBean(String usernameOrEmail, String password);
	/**
	 * �ж��Ƿ�ע��ɹ�
	 * @param userBean
	 * @return false:ע�᲻�ɹ�;true:ע��ɹ�
	 */
	boolean validRegist(UserBean userBean);
}
