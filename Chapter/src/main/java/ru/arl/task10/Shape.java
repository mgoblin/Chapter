package ru.arl.task10;

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

        for (int i=1; i<figures.length; i++){
            figures[i].draw();
        }
    }
}
