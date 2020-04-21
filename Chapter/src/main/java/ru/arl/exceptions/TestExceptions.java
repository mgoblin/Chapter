package ru.arl.exceptions;

public class TestExceptions {

    public int divide(int i, int j) {
        if (j == 0) {
            throw new Exception("Нельзя делить на 0!!!");
        } else {
            return i / j;
        }
    }

    public static void main(String[] args) {
        TestExceptions testExceptions = new TestExceptions();
        testExceptions.divide(0, 0);
    }
}
