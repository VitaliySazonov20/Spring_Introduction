package com.sazonov.springCourse.springIntroduction;

import org.springframework.stereotype.Component;
/*
@Component tells spring container that this class is a Bean
* Id of bean is by default class name with first letter lowercase
* Unless multiple uppercase letters were used in sequence
* Example:
* Class Cat ---> Bean id is cat
* Class SQLTest ---> Bean id is SQLTest
*/

@Component("catBean")
public class Cat implements Pet{
    public Cat(){
        System.out.println("Cat Bean created.");
    }
    @Override
    public void say() {
        System.out.println("Meow Meow");
    }
}
