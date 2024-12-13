package com.sazonov.springCourse.hibernate_one_to_many_uni;


import com.sazonov.springCourse.hibernate_one_to_many_bi.entity.Department;
import com.sazonov.springCourse.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        try{// Session is the connection to the db
            Session session = factory.getCurrentSession();
            Department department = new Department("Management",
                    500_000,100_000);
            Employee employee = new Employee("Mary","Wink",
                    155_000);
            Employee employee2 = new Employee("Caleb","Rock",
                    389_000);

            department.addEmployee(employee);
            department.addEmployee(employee2);
            session.beginTransaction();
            session.persist(department);
            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}