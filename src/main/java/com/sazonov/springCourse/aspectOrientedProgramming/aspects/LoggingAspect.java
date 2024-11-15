package com.sazonov.springCourse.aspectOrientedProgramming.aspects;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: Attempt to get a book");
    }
    @After("execution(public void getBook())")
    public void afterGetBookAdvice(){
        System.out.println("afterGetBookAdvice: A book has been taken");
    }
}
