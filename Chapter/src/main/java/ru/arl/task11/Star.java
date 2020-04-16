package ru.arl.task11;

public class Star extends Shape {

    public Star(String colour) {
        super(colour);
    }

    @Override
    public void draw() {
        System.out.println("Звезда рисуется");
    }
}
