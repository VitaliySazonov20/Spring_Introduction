package com.sazonov.springCourse.springIntroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog myDog = context.getBean("dogBean",Dog.class);
        Dog yourDog = context.getBean("dogBean",Dog.class);
        System.out.println("Are the 2 dogs the same?"+ (myDog==yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);
    }
}
