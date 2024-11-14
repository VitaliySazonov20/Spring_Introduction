package com.sazonov.springCourse.springIntroduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigFileAndAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
    }
}
