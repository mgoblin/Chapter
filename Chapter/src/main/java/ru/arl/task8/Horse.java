package ru.arl.task8;

public class Horse extends Animal {
    public String mane;
    public int paws;
    public int tail;

    @Override
    public void eat() {
        System.out.println("Лошадь ест");
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь спит");
    }

    public Horse(String food, String location, String mane, int paws, int tail) {
        super(food, location);
        this.mane = mane;
        this.paws = paws;
        this.tail = tail;
    }
}
