package com.sazonov.springCourse.springIntroduction;

public class Person {
    private Pet pet;
    private int age;
    public  Person(Pet pet){
        System.out.println("Person Bean created.");
        this.pet = pet;
    }
    public Person(){
        System.out.println("Person Bean created.");
    }
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
}
