package com.sazonov.springCourse.aspectOrientedProgramming;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Crime and Punishment")
    private String name;
    @Value("F.M.Dostoevski")
    private String author;
    @Value("1866")
    private int publicationYear;
    public String getName(){
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getAuthor() {
        return author;
    }
}
