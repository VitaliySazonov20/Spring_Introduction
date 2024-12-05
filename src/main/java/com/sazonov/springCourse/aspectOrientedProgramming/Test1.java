package com.sazonov.springCourse.aspectOrientedProgramming;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniversityLibrary universityLibrary = context.getBean("uniLibraryBean", UniversityLibrary.class);
        Book book = context.getBean("book", Book.class);
//        universityLibrary.getBook();
//        universityLibrary.getMagazine();
        System.out.println(universityLibrary.returnBook(book));

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);
//        schoolLibrary.getBook();
        context.close();
    }
}
