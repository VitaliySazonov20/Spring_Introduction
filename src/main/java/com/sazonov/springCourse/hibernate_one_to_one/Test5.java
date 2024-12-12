package com.sazonov.springCourse.hibernate_one_to_one;

import com.sazonov.springCourse.hibernate_one_to_one.entity.Details;
import com.sazonov.springCourse.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();
        Session session = null;
        try{// Session is the connection to the db
            session = factory.getCurrentSession();

            session.beginTransaction();
            Details details = session.get(Details.class,4);
            System.out.println(details.getEmployee());

            session.getTransaction().commit();
        }
        finally {
            assert session != null;
            session.close();
            factory.close();
        }
    }
}
