package ru.arl.task11;

public class Rectangle extends Shape {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Rectangle(String colour, int x, int y) {
        super(colour);
        this.x=x;
        this.y=y;
    }

    public void draw() {
        System.out.println("Рисуется квадрат");
    }
}
