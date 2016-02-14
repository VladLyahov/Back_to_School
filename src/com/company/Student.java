package com.company;

/**
 * Created by govno on 14.02.2016.
 */
public class Student extends Person {
    String idNumber;
    double gpa;

    public Student(String name, String gender, int birthYear, double gpa, String idNumber) {
        super(name, gender, birthYear);
        this.gpa = gpa;
        this.idNumber = idNumber;
    }

    public String toString() {
        return super.toString() +
                ", gpa=" + gpa +
                ", idNumber='" + idNumber + '\'';
    }
}
