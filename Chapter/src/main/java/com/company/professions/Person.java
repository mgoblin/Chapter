package com.company.professions;

public class Person {
    public String fullName;
    public int age;

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
