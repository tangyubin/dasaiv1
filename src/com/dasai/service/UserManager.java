package com.dasai.service;

import com.dasai.vo.UserBean;

public interface UserManager {
	public static final int LOGIN_FAIL = 0;
	public static final int REGIST_FAIL = 0;
	public static final int NOT_FOUND = 0;
	public static final int USER_TYPE_ADMIN = 1;
	public static final int USER_TYPE_STUDENT = 2;
	public static final int USER_TYPE_TEACHER = 3;
	public static final int USER_TYPE_TEAM = 4;
	/**
	 * ��֤��¼
	 * @param usernameOrEmail �û�����������
	 * @param password ����
	 * @return ��¼������ȷ�ϣ�0Ϊ��¼ʧ�ܣ�1Ϊ��¼Admin��2Ϊ��¼Student��3Ϊ��¼Teacher��4Ϊ��¼Team
	 */
	int validLogin(String usernameOrEmail, String password);
	/**
	 * ��֤�û��������ݿ����Ƿ���ڣ��Լ�������ڵĻ�����ʲô���͵��û�
	 * @param username ��Ҫ������֤���û���
	 * @return 0�����û��������ڣ�1���û�����Ϊ����Ա��2���û�����Ϊѧ����3���û�����Ϊ��ʦ��4���û�����Ϊ�Ŷӣ�
	 */
	int validUsername(String username);
	/**
	 * ��֤���������ݿ����Ƿ���ڣ��Լ�������ڵĻ�����ʲô���͵��û�
	 * @param email ��Ҫ������֤������
	 * @return 0�������䲻���ڣ�1���û�����Ϊ����Ա��2���û�����Ϊѧ����3���û�����Ϊ��ʦ��4���û�����Ϊ�Ŷӣ�
	 */
	int validEmail(String email);
	/**
	 * ��֤ע��
	 * @param user ��ʾ�û���Ϣ��VO�࣬�����ŵ����û�ע����Ϣ
	 * @return ע�������ȷ�ϣ�0Ϊ��¼ʧ�ܣ�1Ϊ��¼Admin��2Ϊ��¼Student��3Ϊ��¼Teacher��4Ϊ��¼Team
	 */
	int validRegist(UserBean user);
}
