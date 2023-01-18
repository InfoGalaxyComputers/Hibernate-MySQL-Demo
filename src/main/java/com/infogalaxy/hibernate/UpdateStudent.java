package com.infogalaxy.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.infogalaxy.hibernate.entity.Student;

/**
 * Hello world!
 *
 */
public class UpdateStudent 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Student.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        
        Student student = session.get(Student.class, 5);
        System.out.println(student.toString());
        
        student.setSemail("naman111@gmail.com");
        
        session.update(student);
        
        session.getTransaction().commit();
    }
}






