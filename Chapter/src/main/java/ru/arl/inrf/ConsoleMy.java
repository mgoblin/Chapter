package ru.arl.inrf;

import ru.arl.input.INumbersInput;
import ru.arl.input.NumbersInput;

public class ConsoleMy implements IMyIntreface, IIntrf2 {
    INumbersInput numbersInput = new NumbersInput(System.in);
    @Override
    public String greeting(String name) {
        // Получить вид приветствия из консоли
        // Пользователь вводит как с ним поздороваться: Привет, Дарова итд
        System.out.println("Как с вами поздороваться?");
        final String greeting = numbersInput.getInput();
        return greeting +" "+ name;
    }

    @Override
    public int age() {
        // Получить возраст из консоли
        System.out.println("Сколько вам лет?");
        final String ageString = numbersInput.getInput();
        try {
            return Integer.parseInt(ageString);
        } catch (NumberFormatException nfe) {
            System.out.println("Неправильное значение");
            return 0; // Вместо 0 вернуть полученное в консоли число
        }
    }
}
