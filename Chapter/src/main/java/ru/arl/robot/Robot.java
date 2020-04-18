package ru.arl.robot;

public class Robot {
    private int x = 0;
    private int y = 0;
    private final int maxX;
    private final int maxY;

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
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
        if (y > 0) {
            y--;
        }
    }

    public void goLeft() {
        if (x > 0) {
            x--;
        }
    }

    public void goRight() {
        if (x < maxX) {
            x++;
        }
    }

}
