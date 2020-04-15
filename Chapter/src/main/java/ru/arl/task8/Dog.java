package ru.arl.task8;

public class Dog extends Animal {
    public int paws;
    public int tail;

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public void sleep() {
        System.out.println("Собака спит");
    }

    public Dog(String food, String location, int paws, int tail) {
        super(food, location);
        this.paws = paws;
        this.tail = tail;
    }
}
