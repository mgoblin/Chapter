package ru.arl.lambdas;

import java.util.List;
import java.util.function.Function;

public class LambdaMain {
    public static void main(String[] args) {
        final List<String> strings = List.of("Str1", "Str2");
        strings.forEach(LambdaMain::print);

        IFunc func = new Func();
        System.out.println(func.concat("Hi"));

        IFunc func1 = new IFunc() {
            @Override
            public String concat(String s) {
                return s + ";;";
            }
        };
        System.out.println(func1.concat("Hi"));

        IFunc func2 = s -> s + ";;;";
        System.out.println(func2.concat("Hi"));

        Function<String, String> func3 = s -> s + ";;;;";
        System.out.println(func3.apply("Hi"));
        System.out.println(func3);

    }

    private static void print(String s) {
        System.out.println(s);
    }
}
