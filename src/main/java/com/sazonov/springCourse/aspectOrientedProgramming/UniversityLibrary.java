package com.sazonov.springCourse.aspectOrientedProgramming;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniversityLibrary extends AbstractLibrary{
    @Override
    public void getBook(){
        System.out.println("We are grabbing a book from Uni library");
    }
    public void getMagazine(){System.out.println("We are grabbing a magazine from Uni library");}
    public void returnBook(String bookName){
        System.out.println("We are returning "+ bookName+" to Uni Library");
    }
}
