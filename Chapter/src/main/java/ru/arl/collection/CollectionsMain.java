package ru.arl.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsMain {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Рубен");
        names.add("Михаил");
        names.add("Просто строка");
        System.out.println(names);

        names.remove("Просто строка");
        System.out.println(names);

        if (names.remove("Какая-то строка")) {
            System.out.println("Какая-то строка удалена");
        } else {
            System.out.println("Удалить не получилось");
        }

        System.out.println("А как мне понять есть ли такая строка в коллекции?");
        if (names.contains("Рубен")) {
            System.out.println("Есть!!");
        }

        System.out.println("А как мне узнать сколько элементов в коллекции?");
        System.out.println(names.size());
    }
}
