package ru.arl.numbers;

public class NumbersMain {

    public void printNumbers(int a, int b) {
        System.out.println("тут мы будем делать полезное дело");
        if (a <= b) {
            for(int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            printNumbers(b, a);
        }
    }

    public static void main(String[] args) {
        final NumbersMain numbersMain = new NumbersMain();

        numbersMain.printNumbers(10, 20);
        numbersMain.printNumbers(15, 7);
    }
}
