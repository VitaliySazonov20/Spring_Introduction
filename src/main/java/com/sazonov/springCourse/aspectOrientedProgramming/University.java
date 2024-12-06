package com.sazonov.springCourse.aspectOrientedProgramming;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();
    public void addStudents(){
        Student st1 = new Student("Alex Johnson", 4,7.8);
        Student st2 = new Student("Alexandria Colt", 2,9.5);
        Student st3 = new Student("Mary Winchester", 4,5.3);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }
    public List<Student> getStudents(){
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
