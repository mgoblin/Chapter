package task1_1;

import java.util.Scanner;
import java.util.Random;

public class Task3_1 {
    public static void main(String[] args) {
        guessNumber();
    }

    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    private static int generateRandomNumber() {
        int num = random.nextInt(10);
        System.out.println("Угадай число с 3 попыток от 0 до 9");
        return num;
    }

    public static int getUserGuess() {
        System.out.println("Введи свой ответ:");
        return scanner.nextInt();
    }

    public static boolean isGuessSuccess(int guess, int num) {
        return guess == num;
    }

    public static void getTip(int guess, int num, int tryCount) {
        System.out.println(guess > num ? "Введенное число больше " : "Введенное число меньше ");
        System.out.println((tryCount - 1) > 0 ? " у вас осталось " + (tryCount - 1) + " попыток." : "Попытки закончились, вы проиграли.");
    }

    private static void guessNumber() {
        do {
            int num = generateRandomNumber();

            for (int tryCount = 3; tryCount > 0; tryCount--) {
                int guess = getUserGuess();
                if (isGuessSuccess(guess, num)) {
                    System.out.println("Вы угадали число!");
                    break;
                } else {
                    getTip(guess, num, tryCount);
                }

            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        }
        while (scanner.nextInt() == 1);
    }


}

