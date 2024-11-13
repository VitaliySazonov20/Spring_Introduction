package com.sazonov.springCourse.springIntroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjection {
    public static void main(String[] args) {
//        Normal application without Spring

        /*Pet pet = new Cat();
        Person person = new Person(pet);
        person.callYourPet();*/

//        Change myPet Bean to change which pet is used in applicationContext


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        User either constructor-arg or property tag to either use constructor
//        or setter for pet dependency
        Person person = context.getBean("myPerson",Person.class);
        person.callYourPet();
//      Age is found in properties file and is set by using property tag in applicationContext
        System.out.println(person.getAge());
        context.close();

    }
}
