package com.company;

/**
 * Created by govno on 14.02.2016.
 */
public class Person {

    public String name;
    public String gender;
    public int age;

    Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public String toString() {
        return name +
                ", age= " + age +

                ", gender " + gender
                ;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
