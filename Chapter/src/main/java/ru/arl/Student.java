package ru.arl;

public class Student {
    private String firstName = "нет";
    private String lastName = "нет";
    private String group = "нет";
    private double averageMark = 0;

    public void getAverageMark(double averageMark) {
        if (this.averageMark == 5) {
            System.out.println("Стипендия: 100");
        } else {
            System.out.println("Стипендия: 80");
        }
    }


    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}
