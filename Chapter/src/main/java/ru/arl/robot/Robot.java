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

    public void goUp() {
        System.out.println("Робот шагает вверх");
        if (y < maxY) {
            y++;
            System.out.printf("Робот размещен в позиции x = %d, y = %d. \n", getX(), getY());
        } else {
            System.out.println("Тупик");
        }
    }

    public void goDown() {
        System.out.println("Робот шагает вниз");
        if (y > 0) {
            y--;
            System.out.printf("Робот размещен в позиции x = %d, y = %d. \n", getX(), getY());
        }
        else {
            System.out.println("Тупик");
        }
    }

    public void goLeft() {
        System.out.println("Робот шагает налево");
        if (x > 0) {
            x--;
            System.out.printf("Робот размещен в позиции x = %d, y = %d. \n", getX(), getY());
        } else {
            System.out.println("Тупик");
        }
    }

    public void goRight() {
        System.out.println("Робот шагает направо");
        if (x < maxX) {
            x++;
            System.out.printf("Робот размещен в позиции x = %d, y = %d. \n", getX(), getY());
        } else {
            System.out.println("Тупик");
        }
    }

    public void joystick() {
        Scanner j = new Scanner(System.in);
        System.out.println("Введите команду из списка:"+ '\n' + "Вверх, Вниз, Вправо, Влево, Конец");
        String scanner = j.nextLine();
        if (scanner.equals("Вверх")) {
            goUp();
            joystick();
        } else if (scanner.equals("Вниз")) {
            goDown();
            joystick();
        } else if (scanner.equals("Вправо")) {
            goRight();
            joystick();
        } else if (scanner.equals("Влево")) {
            goLeft();
            joystick();
        } else if(scanner.equals("Конец")) {
            System.out.println("Досвидание");
        } else {
            System.out.println("Ошибка! Неверная команда");
            joystick();
        }
    }
}
