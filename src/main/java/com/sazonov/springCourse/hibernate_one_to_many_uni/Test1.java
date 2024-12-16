package com.sazonov.springCourse.hibernate_one_to_many_uni;


import com.sazonov.springCourse.hibernate_one_to_many_uni.entity.Department;
import com.sazonov.springCourse.hibernate_one_to_many_uni.entity.Employee;
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
//            Department department = new Department("Sales",
//                    700_000,300_000);
//            Employee employee = new Employee("Maria","Wong",
//                    455_000);
//            Employee employee2 = new Employee("Garet","Lamanour",
//                    530_000);
//
//            department.addEmployee(employee);
//            department.addEmployee(employee2);
            session.beginTransaction();
//            session.persist(department);
            Department department =session.get(Department.class,3);
            System.out.println(department);
            System.out.println(department.getEmployeeList());
            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
