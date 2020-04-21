package ru.arl.exceptions;

public class TestExceptions {

    public int divide(int i, int j) throws Exception {
        if (j == 0) {
            throw new Exception("Нельзя делить на 0!!!");
        } else {
            return i / j;
        }
    }

    public static void main(String[] args) throws Exception {
        TestExceptions testExceptions = new TestExceptions();

        System.out.println("Результат деления: " + testExceptions.divide(0, 0));
    }
}
