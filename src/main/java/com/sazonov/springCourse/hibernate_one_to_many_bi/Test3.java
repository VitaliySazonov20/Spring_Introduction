package com.sazonov.springCourse.hibernate_one_to_many_bi;


import com.sazonov.springCourse.hibernate_one_to_many_bi.entity.Department;
import com.sazonov.springCourse.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        try{// Session is the connection to the db
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class,3);

            //Will remove the department and ALL its employees due to cascadeType.ALL
            session.remove(employee);
            
            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
