package com.company;

/**
 * Created by govno on 14.02.2016.
 */
public class CollegeStudent extends Student {

    int year;
    String major;

    public CollegeStudent(String name, String gender, int birthYear, double gpa, String idNumber, String major, int year) {
        super(name, gender, birthYear, gpa, idNumber);
        this.major = major;
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() +

                ", major'" + major + '\'' +
                ", year=" + year;
    }
}
