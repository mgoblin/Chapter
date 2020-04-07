package ru.arl;

public class Person {
    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void talk()
    {
        System.out.println("Такой-то "+fullName+" говорит");
    }
    public void move()
    {
        System.out.println("Такой-то "+fullName+" двигается");
    }
    public Person(String fullName,int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public Person() {
    }

    public static void main(String[] args) {
        Person ruben = new Person("Ruben",21);
        ruben.talk();
        ruben.move();

        Person nekto = new Person();


    }


}
