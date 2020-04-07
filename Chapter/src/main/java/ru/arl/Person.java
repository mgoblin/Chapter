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

    public void talk(String fullName)
    {
        System.out.println("Такой-то "+getFullName()+" говорит");
    }
    public void move(String fullName)
    {
        System.out.println("Такой-то "+getFullName()+" двигается");
    }
    public Person(String fullName,int age) {
    }
    public Person() {
    }

    public static void main(String[] args) {
        Person ruben = new Person("Ruben",21);
        ruben.talk("Рубен");
        ruben.move("Рубен");

        Person nekto = new Person();
        nekto.talk();
        nekto.move();

    }


}
