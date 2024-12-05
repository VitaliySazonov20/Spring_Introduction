package com.sazonov.springCourse.aspectOrientedProgramming.aspects;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    /*Execution pointCut
    *
    * execution(access-modifiers-patter? return-type-pattern declaring-type-patter?
    *       method-name-patter(parameters-pattern) throws-pattern?)
    *
    * PointCuts without ? are required
    *
    * PointCut with * is wild card so get* is any method that starts with get
    * */

    @Pointcut("execution(public * get*())")
    private void allGetMethods(){}


//    @Before("execution(public void com.sazonov.springCourse.aspectOrientedProgramming.UniversityLibrary.getBook())")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: Attempt to get a book");
//    }
    @Before("allGetMethods()")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: Attempt to get a book/magazine");
    }
    @After("allGetMethods()")
    public void afterGetBookAdvice(){
        System.out.println("afterGetBookAdvice: A book has been taken");
    }
//    @Before("execution(public * returnBook(..))")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice: Attempt to return book");
//    }
    @Before("execution(public * returnBook(com.sazonov.springCourse.aspectOrientedProgramming.Book))")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: Attempt to return book");
    }
    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: Checking credentials for getting a book/magazine");
    }

}
