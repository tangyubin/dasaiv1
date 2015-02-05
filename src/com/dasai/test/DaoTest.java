package com.dasai.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dasai.dao.MessageDao;
import com.dasai.dao.TeacherDao;
import com.dasai.dao.TeamDao;
import com.dasai.dao.UserDao;
import com.dasai.dao.WorkDao;
import com.dasai.domain.Message;
import com.dasai.domain.Teacher;
import com.dasai.domain.Team;
import com.dasai.domain.User;
import com.dasai.domain.Work;

public class DaoTest {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		TeamDao teamDao = (TeamDao) ctx.getBean("teamDao");
		
		//UserDao userDao = (UserDao)ctx.getBean("userDao");
		//List<User> users = userDao.findByUsernameAndPassword("zhangsan", "1234");
//		List<User> users = userDao.findByEmail("zhangsan1");
//		if(users == null) {
//			System.out.println("null");
//		}else {
//			System.out.println(users.size());
//		}
//		User user = new User();
//		user.setUsername("zhangsan");
//		user.setPassword("123");
//		user.setEmail("tang-yu-bin@qq.com");
//		user.setEmailCheckback(false);
//		userDao.save(user);
//		Work work = new Work();
//		work.setTitle("hello");
//		work.setOwner(user);
//		WorkDao workDao = (WorkDao) ctx.getBean("workDao");
//		workDao.save(work);
		
//		User user2 = new User();
//		user2.setUsername("lisi");
//		user2.setPassword("123");
//		user2.setEmail("lisi@qq.com");
//		user2.setEmailCheckback(true);
//		userDao.save(user2);
//		Message mess = new Message();
//		mess.setContent("hello");
//		mess.setFrom(user);
//		mess.setTo(user2);
//		mess.setIsReaded(false);
//		MessageDao messageDao = (MessageDao) ctx.getBean("messageDao");
//		messageDao.save(mess);
		//User user3 = userDao.get(1);
		//System.out.println(user.getSentMessage().size());
//		for(Message mss : user3.getSentMessage()) {
//			System.out.println(mss.getContent());
//		}
		
		
	}
}
