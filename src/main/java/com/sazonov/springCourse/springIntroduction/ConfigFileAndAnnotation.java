package com.sazonov.springCourse.springIntroduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigFileAndAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
//        Pet cat = context.getBean("catBean",Pet.class);
//        Pet cat2 = context.getBean("catBean",Pet.class);
//        System.out.println("Are the 2 pets the same? "+ (cat==cat2));
//        cat.say();


        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
    }
}
