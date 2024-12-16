package com.sazonov.springCourse.hibernate_many_to_many;

import com.sazonov.springCourse.hibernate_many_to_many.entity.Child;
import com.sazonov.springCourse.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
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
            Section section = session.get(Section.class,1);
            System.out.println(section);
            System.out.println(section.getChildList());
            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();

        }
    }
}
