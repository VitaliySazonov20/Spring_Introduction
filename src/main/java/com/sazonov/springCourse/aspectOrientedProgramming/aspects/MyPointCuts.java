package com.sazonov.springCourse.aspectOrientedProgramming.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution(public * get*())")
    public void allGetMethods(){}
}