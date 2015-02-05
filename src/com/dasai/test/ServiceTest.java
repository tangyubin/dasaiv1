package com.dasai.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dasai.service.UserManager;
import com.dasai.vo.UserBean;

public class ServiceTest {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		UserManager userManager = (UserManager) ctx.getBean("userManager");
//		System.out.println(userManager.validEmail("tang-yu-bin2@qq.com"));
//		System.out.println(userManager.validUsername("zhangsan"));
//		System.out.println(userManager.validUsername("zhangsan2"));
//		System.out.println(userManager.validLogin("team@qq.com", "123"));
//		System.out.println(userManager.validLogin("zhangsan", "123"));
//		System.out.println(userManager.validLogin("lisi", "123"));
		UserBean user = new UserBean();
		user.setUsername("zhangsan");
		user.setPassword("123");
		user.setEmail("zhangsan@qq.com");
		user.setUserType("Ñ§Éú");
		System.out.println(userManager.validRegist(user));
	}

}
