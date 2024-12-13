package com.sazonov.springCourse.hibernate_one_to_many_bi;


import com.sazonov.springCourse.hibernate_one_to_many_bi.entity.Department;
import com.sazonov.springCourse.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        try{// Session is the connection to the db
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Department department =session.get(Department.class,1);
//            System.out.println(department);
//            System.out.println(department.getEmployeeList());

            Employee employee = session.get(Employee.class,1);
            System.out.println(employee);
            System.out.println(employee.getDepartment());

            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
