package com.company.professions;

public class Person extends Driver {

    public int age;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", experience=" + experience +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
