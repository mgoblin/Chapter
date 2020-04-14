package com.company.professions;

public class Driver {
    public int experience;

    public Driver(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                '}';
    }
}
