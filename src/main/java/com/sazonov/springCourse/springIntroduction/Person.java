package com.sazonov.springCourse.springIntroduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("dogBean")
    private Pet pet;
//    @Value("${person.age}")
    private int age;
//    @Value("${person.lastName}")
    private String lastName;

    /*Autowired annotation automatically uses needed Beans in constructor*/
//    @Autowired
    public  Person(@Qualifier("dogBean") Pet pet){
        System.out.println("Person Bean created.");
        this.pet = pet;
    }
    public Person(){
        System.out.println("Person Bean created.");
    }
    /*Same as constructor will automatically set dependency if found needed Bean*/
    //@Autowired
    public void setPet(Pet pet){
        System.out.println("Class Person has set a pet");
        this.pet = pet;
    }
    public void callYourPet(){
        System.out.println("Come here my precious!");
        pet.say();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
