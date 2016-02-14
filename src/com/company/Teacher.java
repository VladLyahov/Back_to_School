package com.company;

/**
 * Created by govno on 14.02.2016.
 */
public class Teacher extends Person {

    double salary;
    String subject;

    public Teacher(String name, String gender, int birthYear, double salary, String subject) {
        super(name, gender, birthYear);
        this.salary = salary;
        this.subject = subject;
    }


    public String toString() {
        return name +
                ", age= " + age +

                ", gender= " + gender +
                ", salary=" + salary +
                ", subject= " + subject
                ;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
