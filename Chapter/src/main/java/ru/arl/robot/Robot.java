package ru.arl.robot;

public class Robot {
    private int x=0;
    private int y=0;

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

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void goUp() {
        x++;
    }
    public void goDown(int x) {}
    public void goLeft(int y) {}
    public void goRight(int y) {}

}
