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

    public int goUp() {
        x++;
        System.out.println(x+" "+y);
        return x;
    }
    public void goDown(int x) {}
    public void goLeft(int y) {}
    public void goRight(int y) {}

    public static void main(String[] args) {
        Robot ruben = new Robot(0,0);
        ruben.goUp();
        ruben.goUp();

    }
}
