package com.sazonov.springCourse.hibernate;

import com.sazonov.springCourse.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            //Query is using Java classes/fields not name of tables or columns.
//            List<Employee> employeeList =session.createQuery("from Employee")
//                    .getResultList();

            //surname is not the name of the column but the name of the field
            //in Employee class.
//            List<Employee> employeeList = session.createQuery("from Employee "+
//                    "where surname = 'Doe'AND salary > 80_000")
//                    .getResultList();
//            for (Employee emp: employeeList){
//                System.out.println(emp);
//            }
//            Employee employee =session.get(Employee.class, 1);
//
//            //Class is connected to db. Any changes done to class before commit
//            //will be updated in bd once commit has been called.
//            employee.setSalary(100_000);

            session.createQuery("update Employee set salary = 105_000 "+
                            "where surname = 'Doe'").executeUpdate();

            session.getTransaction().commit();

        }
        finally {
            factory.close();
        }
    }
}
