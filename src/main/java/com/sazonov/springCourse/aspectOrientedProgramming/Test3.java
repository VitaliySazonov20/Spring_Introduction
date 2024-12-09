package com.sazonov.springCourse.aspectOrientedProgramming;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main Starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniversityLibrary library = context.getBean("uniLibraryBean", UniversityLibrary.class);
        String bookName = library.returnBook();
        System.out.println("Returned "+ bookName+" to library");

        context.close();
        System.out.println("Method main ends");
    }
}
