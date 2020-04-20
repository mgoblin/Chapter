package ru.arl.robot;

import java.util.Scanner;

public class Joystick {
    public String getUserCommand() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
