package com.sazonov.springCourse.hibernate_many_to_many;

import com.sazonov.springCourse.hibernate_many_to_many.entity.Child;
import com.sazonov.springCourse.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session =null;
        try{
            session = factory.getCurrentSession();

            session.beginTransaction();
            Child child = session.get(Child.class,5);
            System.out.println(child);
            System.out.println(child.getSectionList());
            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();

        }
    }
}
