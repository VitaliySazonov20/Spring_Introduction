package com.sazonov.springCourse.hibernate_one_to_one;

import com.sazonov.springCourse.hibernate_one_to_one.entity.Details;
import com.sazonov.springCourse.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();

        try{// Session is the connection to the db
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("John","Doe",
                    "Sales", 80_000);
            Details details = new Details("Moscow","+79171238906","NotRealEmail@email.com");
            employee.setDetails(details);
            session.beginTransaction();

            session.save(employee);
            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
