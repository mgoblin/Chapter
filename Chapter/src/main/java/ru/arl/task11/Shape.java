package ru.arl.task11;

public abstract class Shape {
    private String colour;

    public Shape(String colour) {
        this.colour = colour;
    }

    public abstract void draw();

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public static void drawShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public static void main(String[] args) {
        Shape[] figures = new Shape[] {
                new Circle("Белый", 10, 10),
                new Rectangle("Черный", 1, 2),
                new Triangle("Синий", 1),
                new Star("Яркая")
        };

        Circle circle1 = new Circle("Белый", 10, 10);
        Circle circle2 = new Circle("Белый", 10, 10);
        Circle circle3 = new Circle("Белый", 10, 10);

        boolean eq = circle1 == circle2;
        boolean eq2 = circle2 == circle3;

        boolean equals = circle1.equals(circle2);
        System.out.println(eq);
        System.out.println(eq2);
        System.out.println(equals);
    }
}
