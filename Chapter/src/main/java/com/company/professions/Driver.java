package com.company.professions;

public class Driver extends Person {
    public int experience;
    public String fullName;

    public Driver(int experience, String fullName) {
        this.experience = experience;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
