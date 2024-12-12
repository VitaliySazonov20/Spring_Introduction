package com.sazonov.springCourse.hibernateTest1;

import com.sazonov.springCourse.hibernateTest1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Query is using Java classes/fields not name of tables or columns.
            List<Employee> employeeList =session.createQuery("from Employee")
                    .getResultList();

            for (Employee emp: employeeList){
                System.out.println(emp);
            }

            //surname is not the name of the column but the name of the field
            //in Employee class.
            List<Employee> employeeList2 = session.createQuery("from Employee "+
                    "where surname = 'Doe'AND salary > 80_000")
                    .getResultList();
            for (Employee emp: employeeList2){
                System.out.println(emp);
            }
        }
        finally {
            factory.close();
        }
    }
}
