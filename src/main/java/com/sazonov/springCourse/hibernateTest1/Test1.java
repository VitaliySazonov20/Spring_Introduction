package com.sazonov.springCourse.hibernateTest1;

import com.sazonov.springCourse.hibernateTest1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{// Session is the connection to the db
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Bob", "Grant",
                    "CEO", 150_000);
            session.beginTransaction();
            //session.save INSERTS into DB
            //session.save is deprecated and recommended to use session.persist

            session.save(employee);
            session.persist(employee);
            session.getTransaction().commit();

            //Id is not in constructor but bd auto generates it.
            //Auto generated ID from bd is saved in employee.
            System.out.println("added employee: "+ employee);

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
