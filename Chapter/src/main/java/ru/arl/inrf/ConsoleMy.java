package ru.arl.inrf;

public class ConsoleMy implements IMyIntreface, IIntrf2 {
    @Override
    public String greeting(String name) {
        // Получить вид приветствия из консоли
        // Пользователь вводит как с ним поздороваться: Привет, Дарова итд
        String greeting = ...
        return greeting + name;
    }

    @Override
    public int age() {
        // Получить возраст из консоли
        return 0; // Вместо 0 вернуть полученное в консоли число
    }
}
