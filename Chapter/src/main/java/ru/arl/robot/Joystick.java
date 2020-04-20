package ru.arl.robot;

import java.util.Scanner;

public class Joystick {

    private Scanner scanner = new Scanner(System.in);

    public Command getUserCommand() {
        final String s = scanner.nextLine();
        switch (s) {
            case "Влево": return Command.LEFT;
            case "Вправо": return Command.RIGHT;
            case "Вверх": return Command.UP;
            case "Вниз": return Command.DOWN;
            case "Выход": return Command.QUIT;
            default: return Command.UNKNOWN;
        }
    }
}
