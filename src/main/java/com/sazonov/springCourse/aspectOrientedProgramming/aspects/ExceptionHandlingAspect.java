package com.sazonov.springCourse.aspectOrientedProgramming.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class ExceptionHandlingAspect {
    @Before("com.sazonov.springCourse.aspectOrientedProgramming.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("beforeAddExceptionHandlingAdvice: catching/handling "+
                "execption when attempting to get book/magazine");
        System.out.println("---------------------------------------------------------------");
    }
}
