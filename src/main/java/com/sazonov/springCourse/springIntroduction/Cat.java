package com.sazonov.springCourse.springIntroduction;

public class Cat implements Pet{
    public Cat(){
        System.out.println("Cat Bean created.");
    }
    @Override
    public void say() {
        System.out.println("Meow Meow");
    }
}
