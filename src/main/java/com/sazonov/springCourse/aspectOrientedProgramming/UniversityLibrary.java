package com.sazonov.springCourse.aspectOrientedProgramming;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniversityLibrary extends AbstractLibrary{
    @Override
    public void getBook(){
        System.out.println("We are grabbing a book from Uni library");
        System.out.println("---------------------------------------");
    }
    public void getMagazine(){
        System.out.println("We are grabbing a magazine from Uni library");
        System.out.println("-------------------------------------------");
    }
    public String returnBook(){
        int a = 10/0;
        System.out.println("We are returning a book to Uni Library");
//        System.out.println("--------------------------------------");
        return "War and Peace";
    }
    public void returnMagazine(){
        System.out.println("We are returning a magazine to Uni Library");
        System.out.println("------------------------------------------");
    }
    public void addBook(String personName,Book book){
        System.out.println("We are adding a book to Uni Library");
        System.out.println("-----------------------------------");
    }
    public void addMagazine(){
        System.out.println("We are adding a magazine to Uni Library");
        System.out.println("---------------------------------------");
    }
}
