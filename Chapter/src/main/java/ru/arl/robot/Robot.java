package ru.arl.robot;

public class Robot {
    public int x=0;
    public int y=0;

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Robot() {}

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
