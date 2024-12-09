package com.sazonov.springCourse.aspectOrientedProgramming.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("aroundReturnBookLoggingAdvice: attempting to return a book to library");

        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("aroundReturnBookLoggingAdvice: successfully returned a book to library");
        System.out.println("aroundReturnBookLoggingAdvice: method returnBook was completed in "+
                (end-begin)+ " milliseconds");
        return targetMethodResult;
    }
}
