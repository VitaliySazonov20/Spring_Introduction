package com.sazonov.springCourse.aspectOrientedProgramming.aspects;

import com.sazonov.springCourse.aspectOrientedProgramming.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    /*
    * AfterReturning is done as soon as the method finishes.
    *
    * AfterThrowing is done once the method finishes if an exception was thrown
    *
    * After is done as soon as method finishes regardless if an exception was thrown
    *
    * */
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: Logging #1 before getStudents");
    }
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent =students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. "+ nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//        double avgGrade = firstStudent.getAvgGrade();
//        firstStudent.setAvgGrade(avgGrade+1);
//        System.out.println("afterGetStudentsLoggingAdvice: Logging #2 after getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterGetStudentsExceptionThrownLoggingAdvice(Throwable exception){
//
//        System.out.println("afterGetStudentsExceptionThrownLoggingAdvice: Logging #3 after getStudents throws exception "+ exception);
//    }
    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: Logging #4 after normal"+
                " execution or thrown exception");
    }
}
