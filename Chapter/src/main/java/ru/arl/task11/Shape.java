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

        drawShapes(figures);
    }
}
