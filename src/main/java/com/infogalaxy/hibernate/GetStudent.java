package com.infogalaxy.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.infogalaxy.hibernate.entity.Student;

public class GetStudent {

	public static void main(String[] args) {
		//Environment evEnvironment = null;
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Student.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Student student = session.get(Student.class, 3);
		
		System.out.println(student.toString());
	}
	
}



