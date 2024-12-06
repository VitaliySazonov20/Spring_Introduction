package com.sazonov.springCourse.aspectOrientedProgramming.aspects;

import com.sazonov.springCourse.aspectOrientedProgramming.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    /*
    * AfterReturning is done as soon as the method finishes.
    *
    * */
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: Logging #1 before getStudents");
    }
    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterGetStudentsLoggingAdvice(List<Student> students){
        Student firstStudent =students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. "+ nameSurname;
        firstStudent.setNameSurname(nameSurname);
        double avgGrade = firstStudent.getAvgGrade();
        firstStudent.setAvgGrade(avgGrade+1);
        System.out.println("afterGetStudentsLoggingAdvice: Logging #2 after getStudents");
    }

}
