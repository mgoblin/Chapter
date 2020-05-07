package ru.arl.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsMain {
    public static void main(String[] args) {

        final List<String> names = Arrays.asList("Злата", "Тея");
        System.out.println(names);

        System.out.println(names.get(1));
        names.set(0, "Рубен");
        System.out.println(names.get(0));
    }
}
