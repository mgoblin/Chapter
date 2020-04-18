package ru.arl.robot;

public class Robot {
    private int x = 0;
    private int y = 0;
    private final int maxX;
    private final int maxY;

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

    public Robot(int x, int y, int maxX, int maxY) {
        this.x = x;
        this.y = y;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public void goUp() {
        if (y < maxY) {
            y++;
        }
    }

    public void goDown() {
        if (y < maxY) {
            y--;
        }
    }

    public void goLeft() {
        if (x < maxX) {
            x--;
        }
    }

    public void goRight() {
        if (x < maxX) {
            x++;
        }
    }

}
