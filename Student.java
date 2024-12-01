package org.example;

import java.io.*;

public class Student implements Serializable {

    //region Fields

    private String name;
    private int age;
    transient private double GPA;

    //endregion

    //region Constructors

    public Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    //endregion

    //region Methods

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGPA() {
        return GPA;
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + GPA);
    }

    //endregion
}