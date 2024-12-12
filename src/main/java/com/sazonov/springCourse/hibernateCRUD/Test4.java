package com.sazonov.springCourse.hibernateCRUD;

import com.sazonov.springCourse.hibernateCRUD.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee =session.get(Employee.class, 1);

            //Class is connected to db. Any changes done to class before commit
            //will be updated in bd once commit has been called.
            employee.setSalary(100_000);

            session.createQuery("update Employee set salary = 105_000 "+
                            "where surname = 'Doe'").executeUpdate();

            session.getTransaction().commit();

        }
        finally {
            factory.close();
        }
    }
}
