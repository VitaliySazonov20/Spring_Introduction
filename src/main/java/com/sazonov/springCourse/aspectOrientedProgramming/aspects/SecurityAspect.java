package com.sazonov.springCourse.aspectOrientedProgramming.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(5)
public class SecurityAspect {
    @Before("com.sazonov.springCourse.aspectOrientedProgramming.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddSecurityAdvice(){
        System.out.println("beforeAddSecurityAdvice: Checking credentials for getting a book/magazine");
        System.out.println("-------------------------------------------------------------------------");
    }
}
