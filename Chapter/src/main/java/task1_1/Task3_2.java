package task1_1;

import java.util.Scanner;
import java.util.Random;

public class Task3_2 {
    private static int MAX_LENGTH = 15;
    private static Random random = new Random();

    private static String getRandomWord(String[] words) {
        return words[random.nextInt(words.length - 1)];
    }

    private static void guessWord() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String word = getRandomWord(words);
        System.out.println("Я загадал фрукт (не более 15 букв), попробуй отгадать его");
        System.out.println(word);

        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Введи свой ответ: (для выхода из игры, просто нажмите Enter)");
            String answer = scanner.nextLine().substring(0, MAX_LENGTH - 1);

            if (word.equals(answer)) {
                System.out.println("Вы угадали слово, игра закончена!!!");
                break;
            } else {
                System.out.println(getTip(answer, word));
            }
        } while (true);
    }


    public static String getTip(String answer, String word) {
        char[] charMarks = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        char[] charsAnswer = answer.toCharArray();

        int len = Math.min(answer.length(), word.length());
        for (int i = 0; i < len; i++) {
            if (word.charAt(i) == charsAnswer[i]) charMarks[i] = charsAnswer[i];
        }
        return new String(charMarks);
    }

    public static void main(String[] args) {
        guessWord();
    }
}
//переписать. Сначала решетки 15, потом заменить в них на буквы. Больше методов