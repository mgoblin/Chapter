package ru.arl.robot;

import java.util.Scanner;

public class Joystick {

    private Scanner scanner = new Scanner(System.in);

    public String getUserCommand() {
        return scanner.nextLine();
    }
}
