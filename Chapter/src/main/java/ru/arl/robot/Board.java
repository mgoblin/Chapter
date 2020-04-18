package ru.arl.robot;

public class Board {
    private final byte minX = 0, minY = 0;
    private final byte sizeX, sizeY;

    public byte getSizeX() {
        return sizeX;
    }

    public byte getSizeY() {
        return sizeY;
    }

    public Board(byte sizeX, byte sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
}
