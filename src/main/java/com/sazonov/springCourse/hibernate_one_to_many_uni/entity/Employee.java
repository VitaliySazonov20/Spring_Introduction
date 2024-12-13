package com.sazonov.springCourse.hibernate_one_to_many_uni.entity;

import jakarta.persistence.*;

/*
* Entity says that class will be shown in database
*
* Table clarifies which table from database to use
* If class name is same as table name then no need to clarify
*
* Column clarifies which column to connect field to
* if field name is same as column name then no need to clarify
*
* Id means that that field is the primary key
*
* @GeneratedValue(strategy = GenerationType.IDENTITY)
* Generation strategy for an entity
* Tells Hibernate that the primary key should be automatically generated by the db
* In this case the db will auto increment the key.
*
* GenerationType.SEQUENCE is based on sequence strategy in bd
*
* GenerationType.TABLE is deprecated. Table will hold a unique row.
*
* GenerationType.AUTO is default. Based on which type of db.
* */
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private  int id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.DETACH
    ,CascadeType.REFRESH,CascadeType.MERGE})
    @JoinColumn(name = "department_id")
    private Department department;

    @Column(name="salary")
    private int salary;

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Employee(){

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
