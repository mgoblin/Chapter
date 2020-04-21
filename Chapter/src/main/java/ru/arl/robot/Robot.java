package ru.arl.robot;

import java.util.Scanner;

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

    public void goUp() throws OutOfBorderException {
        if (y < maxY) {
            y++;
        } else {
            throw new OutOfBorderException("Не ходи за пределы доски. Упадешь и сломаешь ножки.");
        }
    }

    public void goDown() throws OutOfBorderException {
        if (y > 0) {
            y--;
        }
        else {
            throw new OutOfBorderException("Не ходи за пределы доски. Упадешь и сломаешь ножки.");
        }
    }

    public void goLeft() throws OutOfBorderException {
        if (x > 0) {
            x--;
        } else {
            throw new OutOfBorderException("Не ходи за пределы доски. Упадешь и сломаешь ножки.");
        }
    }

    public void goRight() throws OutOfBorderException {
        if (x < maxX) {
            x++;
        } else {
            throw new OutOfBorderException("Не ходи за пределы доски. Упадешь и сломаешь ножки.");
        }
    }
}
