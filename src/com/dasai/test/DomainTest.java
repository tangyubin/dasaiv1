package com.dasai.test;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dasai.domain.Admin;
import com.dasai.domain.Message;
import com.dasai.domain.Student;
import com.dasai.domain.Teacher;
import com.dasai.domain.Team;
import com.dasai.domain.User;

public class DomainTest {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session =  sf.openSession();
		Transaction tx = session.beginTransaction();
		Teacher teacher = new Teacher();
		teacher.setUsername("teacher");
		teacher.setPassword("123");
		teacher.setEmail("teacher@dasai.com");
		teacher.setEmailCheckback(false);
		session.save(teacher);
		Admin admin = new Admin();
		admin.setUsername("admin");
		admin.setPassword("123");
		admin.setEmail("admin@dasai.com");
		admin.setEmailCheckback(false);
		session.save(admin);
		Team team = new Team();
		team.setUsername("team");
		team.setPassword("123");
		team.setEmail("team@dasai.com");
		team.setEmailCheckback(false);
		session.save(team);
		Student student = new Student();
		student.setUsername("student");
		student.setPassword("123");
		student.setEmail("student@dasai.com");
		student.setEmailCheckback(false);
		session.save(student);
		/*User u1 = new User();
		u1.setUsername("zhangsan");
		u1.setPassword("123");
		u1.setEmail("123@qq.com");
		u1.setEmailCheckback(false);
		
		session.save(u1);
		User u2 = new User();
		u2.setUsername("lisi");
		u2.setPassword("123");
		u2.setEmail("234@qq.com");
		u2.setEmailCheckback(false);
		session.save(u2);
		
		Message message = new Message();
		message.setContent("hello");
		message.setFrom(u1);
		message.setTo(u2);
		message.setIsReaded(false);
		session.save(message);
		
		User usr = (User) session.load(User.class, new Integer(1));
		for(Message ms : usr.getSentMessage()) {
			System.out.println(ms.getContent());
		}*/
//		Set<Message> s1 = u2.getSentMessage();
//		for(Message ms : s1) {
//			System.out.println(ms.getContent());
//		}
//		Set<Message> s2 = u1.getReceivedMessage();
//		for(Message ms : s2) {
//			System.out.println(ms.getContent());
//		}
		
		
//		Manager mgr = new Manager();
//		mgr.setPass("123");
//		mgr.setSalary(1000.0);
//		mgr.setDept("yanfa");
//		mgr.setName("xiaotang");
//		session.save(mgr);
//		Person p = new Person();
//		p.setName("唐玉宾");
//		p.setAge(24);
//		
//		session.persist(p);
//		
//		Address address = new Address("北京");
//		address.setPerson(p);
//		session.persist(address);
		
		/*p.setAddress(address);*/
		/*Address a2 = new Address("山东");
		session.persist(a2);*/
		
		/*p.getAddresses().add(address);
		p.getAddresses().add(a2);*/
		
		tx.commit();
		session.close();
		sf.close();

	}

}
