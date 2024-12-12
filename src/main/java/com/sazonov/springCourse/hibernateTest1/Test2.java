package com.sazonov.springCourse.hibernateTest1;

import com.sazonov.springCourse.hibernateTest1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{

            Session session = factory.getCurrentSession();
            session = factory.getCurrentSession();
            session.beginTransaction();
            //session.get selects from DB using primary key
            Employee firstEmployee = session.get(Employee.class, 1);
            session.getTransaction().commit();

            System.out.println("firstEmployee: "+ firstEmployee);
        }
        finally {
            factory.close();
        }
    }
}
