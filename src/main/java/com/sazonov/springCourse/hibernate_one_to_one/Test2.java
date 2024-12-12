package com.sazonov.springCourse.hibernate_one_to_one;

import com.sazonov.springCourse.hibernate_one_to_one.entity.Details;
import com.sazonov.springCourse.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
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
            Employee firstEmployee = session.get(Employee.class, 1);
            System.out.println(firstEmployee);
            System.out.println(firstEmployee.getDetails());

            session.getTransaction().commit();
        }
        finally {
            assert session != null;
            session.close();
            factory.close();
        }
    }
}
