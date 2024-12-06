package com.sazonov.springCourse.aspectOrientedProgramming.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(5)
public class SecurityAspect {
    @Before("com.sazonov.springCourse.aspectOrientedProgramming.aspects.MyPointCuts.allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: Checking credentials for getting a book/magazine");
    }
}