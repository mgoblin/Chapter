package ru.arl.lambdas;

public class Func implements IFunc {
    @Override
    public String concat(String s) {
        return s + ";";
    }
}
