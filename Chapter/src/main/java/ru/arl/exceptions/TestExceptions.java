package ru.arl.exceptions;

public class TestExceptions {

    public int divide(int i, int j) {
        if (j == 0) {
            try {
                throw new Exception("Нельзя делить на 0!!!");
            } catch (Exception e) {
                System.out.println("Я знаю ты делил на ноль. Так нельзя");
                return 0;
            }
        } else {
            return i / j;
        }
    }

    public static void main(String[] args) {
        TestExceptions testExceptions = new TestExceptions();
        System.out.println("Результат деления: " + testExceptions.divide(10, 5));
    }
}
