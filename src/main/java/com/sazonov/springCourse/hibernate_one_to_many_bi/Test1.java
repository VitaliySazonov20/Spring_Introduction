package com.sazonov.springCourse.hibernate_one_to_many_bi;


import com.sazonov.springCourse.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Deprecated.class)
                .buildSessionFactory();

        try{// Session is the connection to the db
            Session session = factory.getCurrentSession();

            session.beginTransaction();

            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
