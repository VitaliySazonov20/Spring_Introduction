package com.sazonov.springCourse.aspectOrientedProgramming;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniversityLibrary extends AbstractLibrary{
    @Override
    public void getBook(){
        System.out.println("We are grabbing a book from Uni library");
    }
    public void getMagazine(){System.out.println("We are grabbing a magazine from Uni library");}
    public void returnBook(){
        System.out.println("We are returning a book to Uni Library");
    }
    public void returnMagazine(){
        System.out.println("We are returning a magazine to Uni Library");
    }
    public void addBook(){
        System.out.println("We are adding a book to Uni Library");
    }
    public void addMagazine(){
        System.out.println("We are adding a book to Uni Library");
    }
}
