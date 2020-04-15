package com.company.professions;

public class Driver extends Person {
    public int experience;
    public String fullName;

    public Driver(int age) {
        super(age);
    }


    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
