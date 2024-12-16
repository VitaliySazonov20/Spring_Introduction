package com.sazonov.springCourse.hibernate_many_to_many;

import com.sazonov.springCourse.hibernate_many_to_many.entity.Child;
import com.sazonov.springCourse.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session =null;
        try{
            session = factory.getCurrentSession();
            Section section1 = new Section("Dance");
            Section section2 = new Section("FootBall");
            Section section3 =new Section("VolleyBall");
            Child child1 = new Child("Alex",12);


            child1.addSection(section1);
            child1.addSection(section2);
            child1.addSection(section3);

            session.beginTransaction();
            session.persist(child1);
            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();

        }
    }
}
