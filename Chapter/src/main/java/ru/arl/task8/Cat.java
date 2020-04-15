package ru.arl.task8;

public class Cat extends Animal {
    public int paws;
    public int tail;

    @Override
    public void makeNoise() {
        System.out.println("Кошка спит");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест");
    }

    public Cat(String food, String location, int paws, int tail) {
        super(food, location);
        this.paws = paws;
        this.tail = tail;
    }
}
