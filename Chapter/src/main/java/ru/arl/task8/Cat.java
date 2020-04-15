package ru.arl.task8;

public class Cat extends Animal {
    public int paws;
    public int tail;

    public Cat(String food, String location, int paws, int tail) {
        super(food, location);
        this.paws = paws;
        this.tail = tail;
    }
}
