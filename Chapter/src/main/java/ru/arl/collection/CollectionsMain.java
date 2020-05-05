package ru.arl.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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

        System.out.println("А какие это элементы. Я уже забыл, надо их распечатать");

        // Способ 1
        for(String element: names) {
            System.out.println("Элемент: " + element);
        }

        // Способ 2 - итератор
        final Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            System.out.println("Элемент: " + iterator.next());
        }

        // Добавим одну коллекцию к другой?
        Collection<String> otherNames = new ArrayList<>();
        otherNames.add("Вова");
        otherNames.add("Петя");
        names.addAll(otherNames);
        System.out.println(names);
    }
}
