package com.sazonov.springCourse.hibernate_many_to_many;

import com.sazonov.springCourse.hibernate_many_to_many.entity.Child;
import com.sazonov.springCourse.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session =null;
        try{
            session = factory.getCurrentSession();
            Section section1 = new Section("Chess");
            Child child1 = new Child("Vitaliy",10);
            Child child2 = new Child("Will",11);
            Child child3 = new Child("Caleb",9);
            Child child4 = new Child("John",7);

            section1.addChild(child1);
            section1.addChild(child2);
            section1.addChild(child3);
            section1.addChild(child4);

            session.beginTransaction();
            session.persist(section1);
            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();

        }
    }
}
