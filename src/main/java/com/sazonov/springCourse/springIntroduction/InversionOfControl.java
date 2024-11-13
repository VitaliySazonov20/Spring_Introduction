package com.sazonov.springCourse.springIntroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InversionOfControl {
    public static void main(String[] args) {
//        Normal application without use of Spring
//
//        Pet pet = new Cat();
//        pet.say();



//        Can change bean myPet in resources/applicationContext to get either Dog or Cat
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        context.close();
    }
}
