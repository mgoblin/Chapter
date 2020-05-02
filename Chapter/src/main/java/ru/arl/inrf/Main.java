package ru.arl.inrf;

public class Main {
    public static void main(String[] args) {
//        ConstMy constMy = new ConstMy();
        ConsoleMy concoleMy = new ConsoleMy();
        System.out.println(concoleMy.greeting("Рубен"));
        System.out.println("Твой возраст: " + concoleMy.age());
    }
}
