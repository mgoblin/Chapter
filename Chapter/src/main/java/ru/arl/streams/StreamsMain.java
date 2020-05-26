package ru.arl.streams;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsMain {
    public static void main(String[] args) {

        Function<String, String> reverse = s -> {
          StringBuilder builder = new StringBuilder(s);
          return builder.reverse().toString();
        };

        List<String> names = List.of("Mike", "Alex", "Ruben", "Tea", "Ofelia", "Olga");
        final String find = names.stream().
                filter(s -> s.startsWith("S"))
                .findFirst()
                .orElse("Не найден");

        System.out.println(find);
    }
}
