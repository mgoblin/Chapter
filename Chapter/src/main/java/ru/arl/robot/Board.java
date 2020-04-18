package ru.arl.robot;

public class Board {
    private final int minX = 0;
    private final int minY = 0;
    private final int sizeX;
    private final int sizeY;
    private final Robot robot();

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public int getMinX() {
        return minX;
    }

    public int getMinY() {
        return minY;
    }

    public Board(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
}
