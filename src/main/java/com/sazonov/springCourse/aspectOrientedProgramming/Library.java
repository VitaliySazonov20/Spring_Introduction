package com.sazonov.springCourse.aspectOrientedProgramming;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public void getBook(){
        System.out.println("We have grabbed a book");
    }
}
