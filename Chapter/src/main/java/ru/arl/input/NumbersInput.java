package ru.arl.input;

import java.io.InputStream;
import java.util.Scanner;

public class NumbersInput implements INumbersInput {

    private Scanner scanner;

    public String getInput() {
        System.out.println("Введите данные:");
        return scanner.nextLine();
    }

    public NumbersInput(InputStream is) {
        scanner = new Scanner(is);
    }
}
