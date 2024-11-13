package com.sazonov.springCourse.springIntroduction;

public class Dog implements Pet{
    public Dog(){
        System.out.println("Dog Bean created.");
    }
    @Override
    public void say(){
        System.out.println("Bark Bark");
    }
}
