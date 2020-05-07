package ru.arl.collection;

import java.util.ArrayList;
import java.util.List;

public class ListsMain {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Рубен");
        names.add("Михаил");

        System.out.println(names);

        final List<String> names2 = List.of("Злата", "Тея");
        System.out.println(names2);
    }
}
