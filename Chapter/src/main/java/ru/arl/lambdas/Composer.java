package ru.arl.lambdas;

import java.util.function.Function;

public class Composer {
    public Function<Integer, Integer> doOperation(Function<Integer, Integer>... functions) {
        Function<Integer, Integer> result = functions[0];

        for (int i = 1; i < functions.length; i++) {
            result = result.andThen(functions[i]);
        }
        return result;
    }
}
