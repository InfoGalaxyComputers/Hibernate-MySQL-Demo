package com.infogalaxy.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.infogalaxy.hibernate.entity.Student;

/**
 * Hello world!
 *
 */
public class DeleteStudent 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Student.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        
        Student student = session.get(Student.class, 6);
        System.out.println(student.toString());
        
        session.delete(student);
        
        session.getTransaction().commit();
        
        System.out.println("Student Deleted");
    }
}






