package com.sazonov.springCourse.springIntroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LearningScopes {
    public static void main(String[] args) {
        //Can have multiple config files listed using a comma to separate each one
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        //Test Singleton and Prototype scopes
        Dog myDog =context.getBean("myPet", Dog.class);
        Dog yourDog =context.getBean("myPet", Dog.class);
        System.out.println("Are the 2 dogs the same dog?: " + (myDog==yourDog));
        //Check their reference address
        //Singleton will have same reference while Prototype will have different
        System.out.println(myDog);
        System.out.println(yourDog);
    }
}
