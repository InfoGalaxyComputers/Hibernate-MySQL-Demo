package com.infogalaxy.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.infogalaxy.hibernate.entity.Student;

/**
 * Hello world!
 *
 */
public class AddStudent 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Student.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Student student = new Student();
        student.setSid(6);
        student.setSname("Raj");
        student.setSemail("raj@gmail.com");
        
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        
        System.out.println("Data Added...");
    }
}





