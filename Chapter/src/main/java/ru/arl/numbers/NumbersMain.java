package ru.arl.numbers;

public class NumbersMain {

    public void printNumbers(int a, int b) {
        System.out.println("Печатаем числа");
        if (a <= b) {
            for(int i = a; i <= b; i++) {
                if (i > 0) System.out.println(i);
                else System.out.println(-i);
            }
        } else {
            printNumbers(-a, -b);
        }
    }

    public static void main(String[] args) {
        final NumbersMain numbersMain = new NumbersMain();

        numbersMain.printNumbers(10, 20);
        numbersMain.printNumbers(15, 7);
    }
}
