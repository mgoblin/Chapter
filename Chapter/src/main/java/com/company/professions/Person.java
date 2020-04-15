package com.company.professions;

public class Person extends Driver {

    public int age;

    public Person(int experience, String fullName) {
        super(experience, fullName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", experience=" + experience +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
