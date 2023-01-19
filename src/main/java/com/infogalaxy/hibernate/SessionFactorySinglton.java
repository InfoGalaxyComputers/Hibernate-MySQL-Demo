package com.infogalaxy.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.infogalaxy.hibernate.entity.Student;

public class SessionFactorySinglton {
	
	private static SessionFactory sessionFactory = null;
	
	public SessionFactorySinglton() {
		// TODO Auto-generated constructor stub
	}
	
	public static SessionFactory getInstance() {
    	Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Student.class);
        if(sessionFactory == null)
        sessionFactory = configuration.buildSessionFactory();
        return sessionFactory;
    }
	
}
