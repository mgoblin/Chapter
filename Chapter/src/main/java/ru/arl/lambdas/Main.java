package ru.arl.lambdas;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> inc = x -> x + 1;
        Function<Integer, Integer> twice = x -> x * 2;
        Function<Integer, Integer> incTwice = inc.andThen(twice);
        Function<Integer, Integer> twiceInc = twice.andThen(inc);
        Function<Integer, Integer> smth = twice.compose(inc);

        Composer composer = new Composer();
        System.out.println(composer.doOperation(incTwice, inc, twice).apply(5));
        System.out.println(composer.doOperation(inc, inc).apply(3));

        //Function
        //операторы композиции функции
        //дженерики

        int x = 7;
        System.out.println(inc.apply(x));
        System.out.println(twice.apply(x));
        System.out.println(incTwice.apply(x));
        System.out.println(twiceInc.apply(x));
        System.out.println(smth.apply(x));
    }
}
