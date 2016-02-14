package com.company;

public class Main {

    public static void main(String[] args) {
        Person[] A = new Person[4];
        Person ProstVasya = new Person("ProstVasya", "M", 14);
        A[0] = ProstVasya;
        Teacher Petrovich = new Teacher("Petrovich", "M", 87, 1200, "alcoh olism");
        A[1] = Petrovich;
        Student Vasya = new Student("Vasya", "M", 20, -1.9, "wew241");
        A[2] = Vasya;
        CollegeStudent VasyaJr = new CollegeStudent("VasyaJr", "M", 18, 4.9999, "bfjfa12", "Vodka", 1);
        A[3] = VasyaJr;
        for (int i = 0; i < 4; i++) {
            System.out.println(A[i]);
        }


    }


}
