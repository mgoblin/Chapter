package ru.arl.inrf;

public class Main {
    public static void main(String[] args) {
        ConstMy constMy = new ConstMy();
        System.out.println(constMy.greeting("Рубен"));
        System.out.println("Твой возраст: " + constMy.age());
    }
}
