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
    }
}
