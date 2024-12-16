package com.sazonov.springCourse.hibernate_one_to_many_bi;


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
            Department department = new Department("IT",
                    100_000,30_000);
            Employee employee = new Employee("Anthony","Wilson",
                    60_000);
            Employee employee2 = new Employee("Constantine","Daniel",
                    75_000);
            Employee employee3 = new Employee("William","Forge",
                    65_000);

            department.addEmployee(employee);
            department.addEmployee(employee2);
            department.addEmployee(employee3);
            session.beginTransaction();
            session.persist(department);
            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
