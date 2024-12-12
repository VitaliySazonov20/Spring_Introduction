package com.sazonov.springCourse.hibernateTest1;

import com.sazonov.springCourse.hibernateTest1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee =session.get(Employee.class, 4);

            //Delete was deprecated and is recommended to use remove
            //Remove uses Entity entity instead of Object object.
//            session.delete(employee);
            session.remove(employee);

            session.getTransaction().commit();

        }
        finally {
            factory.close();
        }
    }
}
