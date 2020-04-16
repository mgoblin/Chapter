package ru.arl.task11;

public class Triangle extends Shape {

    private int field;

    public Triangle(String colour, int field) {
        super(colour);
        this.field = field;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    @Override
    public void draw() {
        System.out.println("Треугольник рисуется");
    }
}
