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

    public static void main(String[] args) {
        Shape[] figures= new Shape[2];
        figures[0]=new Circle("Белый",10,10);
        figures[1]=new Rectangle("Черный",1,2);

        for (int i=0; i<figures.length; i++){
            figures[i].draw();
        }

        Shape shape = new Circle("Red", 20, 14);
        shape.draw();
    }
}
