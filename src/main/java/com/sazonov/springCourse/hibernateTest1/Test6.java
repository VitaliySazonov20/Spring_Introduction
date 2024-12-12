package com.sazonov.springCourse.hibernateTest1;

import com.sazonov.springCourse.hibernateTest1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test6 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("delete Employee "+
                    "where surname = 'Doe'").executeUpdate();

            session.getTransaction().commit();

        }
        finally {
            factory.close();
        }
    }
}
