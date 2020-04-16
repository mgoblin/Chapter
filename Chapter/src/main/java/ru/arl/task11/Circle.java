package ru.arl.task11;

public class Circle extends Shape {
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

    public Circle(String colour, int x, int y) {
        super(colour);
        this.x=x;
        this.y=y;
    }

    public void draw() {
        System.out.println("Рисуется круг");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (x != circle.x) return false;
        return y == circle.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
